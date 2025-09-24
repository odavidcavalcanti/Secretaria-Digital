package controller;

import model.Aluno;
import model.Turma;
import service.AlunoService;
import service.TurmaService;
import view.AlunoView;

public class AlunoController {
    private AlunoService alunoService;
    private AlunoView alunoView;
    private TurmaService turmaService;

    //Construtor do controller
    public AlunoController(TurmaService turmaService, AlunoService alunoService, AlunoView alunoView) {
        this.alunoService = alunoService;
        this.alunoView = alunoView;
        this.turmaService = turmaService;
    }

    //Metodo para cadastrar aluno
    public void cadastrarAluno(String nome, String email, String cpf, float nota, int faltas, long idTurma) {
        Turma turma = turmaService.buscarTurma(idTurma);
        Aluno aluno = new Aluno(nome, email, cpf, nota, faltas, turma);
        alunoService.adicionarAluno(aluno);
        alunoView.mostrarMensagem("Aluno adicionado com sucesso!");
    }

    // Metodo para listar os alunos
    public void listarAlunos() {
        alunoView.mostrarAlunos(alunoService.listarAlunos());
    }

}
