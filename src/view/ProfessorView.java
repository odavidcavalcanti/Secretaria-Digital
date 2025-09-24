package view;

import model.Aluno;
import model.Professor;

import java.util.List;

public class ProfessorView {
    // Metodo para professores no console
    public void listarProfessores(List<Professor> professores) {
        System.out.println("\n==========Professores==========");
        if (professores.isEmpty()) {
            System.out.println("Nenhum professor encontrado");
        }
        else {
            for (Professor professor : professores) {
                System.out.println(professor);
            }
        }

        System.out.println("=======================\n");
    }

    // Metodo para mostrar mensagem da execução
    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
