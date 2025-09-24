package service;

import model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoService {
    private List<Aluno> alunos;
    private long proximoId;

    // Construtor
    public AlunoService() {
        this.alunos = new ArrayList<>();
        this.proximoId = 1L;
    }

    // Métodos
    public void adicionarAluno(Aluno aluno) {
        aluno.setNumMatricula(proximoId++);
        this.alunos.add(aluno);
    }

    public List<Aluno> listarAlunos() {
        return this.alunos;
    }
}
