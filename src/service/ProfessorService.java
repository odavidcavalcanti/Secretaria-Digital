package service;


import model.Professor;

import java.util.ArrayList;
import java.util.List;

public class ProfessorService {
    private List<Professor> professores;
    private long proximoId;

    //Construtor
    public ProfessorService() {
        this.professores = new ArrayList<>();
        this.proximoId = 1;
    }

    //Métodos
    public void adicionarProfessor(Professor professor) {
        this.professores.add(professor);
        professor.setNumCadastro(proximoId++);
    }

    public List<Professor> listarProfessores() {
        return professores;
    }
}
