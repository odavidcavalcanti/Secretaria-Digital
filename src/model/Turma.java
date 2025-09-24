package model;

public class Turma {
    private int anoLetivo;
    private char subdivisaoAno;

    // Construtores
    public Turma() {

    }

    public Turma(int anoLetivo, char subdivisaoAno) {
        this.anoLetivo = anoLetivo;
        this.subdivisaoAno = subdivisaoAno;
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

    public String toString() {
        return String.format(
                "Turma %d Ano %c",
                this.getAnoLetivo(),
                this.getSubdivisaoAno());
    }
}
