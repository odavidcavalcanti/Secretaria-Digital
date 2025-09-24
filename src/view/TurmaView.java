package view;

import model.Professor;
import model.Turma;

import java.util.List;

public class TurmaView {
    // Metodo para turmas no console
    public void listarTurmas(List<Turma> turmas) {
        System.out.println("\n==========Turmas==========");
        if (turmas.isEmpty()) {
            System.out.println("Nenhuma turma encontrado");
        }
        else {
            for (Turma turma : turmas) {
                System.out.println(turma);
            }
        }

        System.out.println("=======================\n");
    }

    // Metodo para mostrar mensagem da execução
    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
