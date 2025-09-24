package view;

import model.Aluno;

import java.util.List;

public class AlunoView {

    // Metodo para listar alunos no console
    public void mostrarAlunos(List<Aluno> alunos) {
        System.out.println("\n==========Alunos==========");
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno encontrado");
        }
        else {
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        }

        System.out.println("=======================\n");
    }

    // Metodo para mostrar mensagem da execução
    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
