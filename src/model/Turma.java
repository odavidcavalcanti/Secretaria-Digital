package model;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private long idTurma;
    private int anoLetivo;
    private char subdivisaoAno;
    private List<Aluno> alunosTurma;

    // Construtores
    public Turma() {

    }

    public Turma(int anoLetivo, char subdivisaoAno) {
        this.anoLetivo = anoLetivo;
        this.subdivisaoAno = subdivisaoAno;
        List <Aluno> alunosTurma = new ArrayList<Aluno>();
    }

    // Getters e Setters
    public int getAnoLetivo() {
        return anoLetivo;
    }
    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    public char getSubdivisaoAno() {
        return subdivisaoAno;
    }

    public void setSubdivisaoAno(char subdivisaoAno) {
        this.subdivisaoAno = subdivisaoAno;
    }

    public long getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(long idTurma) {
        this.idTurma = idTurma;
    }

    // Metodos
    public String toString() {
        return String.format("Número da turma: %d%n" +
                        "Turma" + " %d Ano %c:%n",
                this.getIdTurma(),this.getAnoLetivo(), this.getSubdivisaoAno());
    }
}
