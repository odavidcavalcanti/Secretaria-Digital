import controller.AlunoController;
import controller.ProfessorController;
import controller.TurmaController;
import model.Turma;
import service.AlunoService;
import service.ProfessorService;
import service.TurmaService;
import view.AlunoView;
import view.MenuView;
import view.ProfessorView;
import view.TurmaView;

import java.util.Scanner;

public class SecretariaDigital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                //Login

        String loginUsuario = "";
        String loginEmail = "";
        String loginSenha = "";
        String loginCargo = "";

        boolean loginValido = false;

        System.out.println("=== SISTEMA DE GESTÃO ESCOLAR ===");
        System.out.println("=== INSIRA SEUS DADOS ===");

        // Validações para acessar o menu
        while (!loginValido) {
            try {
                System.out.print("Usuário: ");
                loginUsuario = sc.nextLine();

                System.out.print("Email: ");
                loginEmail = sc.nextLine();

                // Valida se e-mail contém @
                if (!loginEmail.contains("@")) {
                    throw new Exception("Email inválido! Deve conter '@'.");
                }

                System.out.print("Senha: ");
                loginSenha = sc.nextLine();

                // Exige um mínimo de 4 caracteres na senha
                if (loginSenha.length() < 4) {
                    throw new Exception("Senha inválida! Deve ter no mínimo 4 caracteres.");
                }

                System.out.print("Cargo (administrador/gerente/colaborador) ");
                loginCargo = sc.nextLine();

                // Valida se os cargo inserido está dentro das opções
                if (!loginCargo.equalsIgnoreCase("administrador") &&
                        !loginCargo.equalsIgnoreCase("gerente") &&
                        !loginCargo.equalsIgnoreCase("colaborador")) {
                    throw new Exception("Cargo inválido! Aceito apenas: administrador, gerente ou colaborador.");
                }

                // Ao validar tudo, concede acesso
                loginValido = true;
                System.out.println("\nBem-vindo, " + loginCargo + " " + loginUsuario + "!");
                System.out.println("Acesso concedido ao sistema.\n");

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Tente novamente.\n");
            }
        }

        // Inicizalização das dependências
        AlunoService alunoService = new AlunoService();
        ProfessorService professorService = new ProfessorService();
        TurmaService turmaService = new TurmaService();

        AlunoView alunoView = new AlunoView();
        ProfessorView professorView = new ProfessorView();
        TurmaView turmaView = new TurmaView();
        MenuView menuView = new MenuView();

        AlunoController alunoController = new AlunoController(turmaService, alunoService,  alunoView);
        ProfessorController professorController = new ProfessorController(professorService,  professorView);
        TurmaController turmaController = new TurmaController(turmaService,  turmaView);

        //Menu Principal com loop enquanto oção for diferente de 0
        int opcao;
        do {
            menuView.displayMenu();
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {

                // Valida se se há turmas existentes
                if(turmaService.listarTurmas().isEmpty()) {
                    System.out.println("Não há turmas disponíveis, por favor, cadastre uma turma!");
                }
                else {

                    //Formulário de cadastro de aluno
                    System.out.println("==========Cadastrar Aluno==========");

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("E-mail: ");
                    String email = sc.nextLine();

                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();

                    System.out.print("Nota: ");
                    float nota = sc.nextFloat();
                    sc.nextLine();

                    System.out.print("Faltas: ");
                    int faltas = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Número da Turma: ");
                    long idTurma = sc.nextInt();
                    sc.nextLine();

                    alunoController.cadastrarAluno(nome, email, cpf, nota, faltas, idTurma);
                }
            }

            if (opcao == 2) {

                // Formulário de cadastro de professor
                System.out.println("==========Cadastrar Professor==========");

                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("E-mail: ");
                String email = sc.nextLine();

                System.out.print("CPF: ");
                String cpf = sc.nextLine();

                System.out.print("Disciplina: ");
                String disciplina = sc.nextLine();

                professorController.cadastrarProfessor(nome,  email, cpf, disciplina);

            }

            if (opcao == 3) {

                // Formulário de cadastro de turmas
                System.out.println("==========Cadastrar Turmas==========");

                System.out.print("Ano letivo: ");
                int anoLetivo = sc.nextInt();
                sc.nextLine();

                System.out.print("Subdivisão do ano: ");
                char subdivisaoAno = sc.next().charAt(0);
                sc.nextLine();

                turmaController.cadastrarTurma(anoLetivo, subdivisaoAno);
            }

            if  (opcao == 4) {
                //Listagem dos alunos
                alunoController.listarAlunos();
            }

            if (opcao == 5) {
                //Listagem dos professores
                professorController.listarProfessores();
            }

            if (opcao == 6) {
                //Listagem das turmas
                turmaController.listarTurmas();
            }

            // Valida se a opção escolhida não está fora das opções existentes
            if  (opcao < 0 ||  opcao > 6) {
                System.out.println("Digite uma opção válida");
            }
        }

        // Encerra loop na opção 0
        while (opcao != 0);


    }
}
