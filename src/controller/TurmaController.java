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

    public void cadastrarTurma(int anoLetivo, char subdivisaoAno) {
        Turma turma = new Turma(anoLetivo, subdivisaoAno);
        turmaService.cadatrarTurma(turma);
        turmaView.mostrarMensagem("Turma Cadastrada com sucesso!");
    }

    public void listarTurmas() {
        turmaView.listarTurmas(turmaService.listarTurmas());
    }
}
