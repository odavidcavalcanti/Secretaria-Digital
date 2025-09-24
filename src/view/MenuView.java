package view;

public class MenuView {

        public MenuView() {

        }

        // Metodo para mostra menu
        public void displayMenu() {
            System.out.println("\n=== SISTEMA DE GESTÃO ESCOLAR ===");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Cadastrar Professor");
            System.out.println("3. Cadastrar Turma");
            System.out.println("4. Listar Alunos");
            System.out.println("5. Listar Professores");
            System.out.println("6. Listar Turmas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
        }
    }
