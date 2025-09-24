package controller;

import model.Turma;
import service.TurmaService;
import view.TurmaView;

public class TurmaController {
    TurmaService turmaService = new TurmaService();
    TurmaView turmaView = new TurmaView();

    //Construtor do controller
    public TurmaController(TurmaService turmaService, TurmaView turmaView) {
        this.turmaService = turmaService;
        this.turmaView = turmaView;
    }

    // Metodo para cadastrar turma
    public void cadastrarTurma(int anoLetivo, char subdivisaoAno) {
        Turma turma = new Turma(anoLetivo, subdivisaoAno);
        turmaService.cadatrarTurma(turma);
        turmaView.mostrarMensagem("Turma Cadastrada com sucesso!");
    }

    // Metodo para listar turmas
    public void listarTurmas() {
        turmaView.listarTurmas(turmaService.listarTurmas());
    }
}
