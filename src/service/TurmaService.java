package service;

import model.Aluno;
import model.Turma;

import java.util.ArrayList;
import java.util.List;

public class TurmaService {
    private List<Aluno> alunosDaTurma = new ArrayList<>();
    private Turma turma;

    // Construtor
    public TurmaService(Turma turma) {
        this.alunosDaTurma = new ArrayList<>();
        this.turma = turma;
    }

    // Métodos
    public void addAlunoTurma(Aluno aluno, Turma turma) {
        if (aluno.getTurma().equals(turma)) {
            this.alunosDaTurma.add(aluno);
        }
    }

    public List<Aluno> ListarAlunosDaTurma() {
        return this.alunosDaTurma;
    }

}

