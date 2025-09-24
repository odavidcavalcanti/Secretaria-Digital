package controller;

import model.Professor;
import model.Turma;
import service.ProfessorService;
import view.ProfessorView;

public class ProfessorController {
    private ProfessorService professorService;
    private ProfessorView professorView;

    // Construtor do controller
    public ProfessorController(ProfessorService professorService, ProfessorView professorView) {
        this.professorService = professorService;
        this.professorView = professorView;
    }

    public void cadastrarProfessor(String nome, String  email, String cpf, String disciplina) {
        Professor professor  = new Professor(nome, email, cpf, disciplina);
        professorService.cadastrarProfessor(professor);
        professorView.mostrarMensagem("Professor cadastrado com sucesso!");

    }

    public void listarProfessores() {
       professorView.listarProfessores(professorService.listarProfessores());
    }
}
