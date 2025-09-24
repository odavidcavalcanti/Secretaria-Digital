package model;

public class Aluno extends Pessoa {
    private long numMatricula;
    private float nota;
    private int faltas;
    private Turma turma;

    // Construtores
    public Aluno() {

    }

    public Aluno(String nome, String email, String cpf, float nota, int faltas, Turma turma) {
        super(nome, email, cpf);
        this.nota = nota;
        this.faltas = faltas;
        this.turma = turma;
    }

    // Getters e Setters
    public long getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(long numMatricula) {
        this.numMatricula = numMatricula;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    // Métodos
    @Override
    public String toString() {
        return String.format(
                "Nome do aluno: %s%n" +
                        "E-mail do aluno: %s%n" +
                        "CPF do aluno: %s%n" +
                        "Número da matrícula: %d%n" +
                        "Turma: %s" + " Ano " + "%c%n" +
                        "Nota do aluno: %.1f%n" +
                        "Faltas do aluno: %d%n" +
                this.getNome(),
                this.getEmail(),
                this.getCpf(),
                this.getNumMatricula(),
                this.getTurma().getAnoLetivo(), this.getTurma().getSubdivisaoAno(),
                this.getNota(),
                this.getFaltas());
    }
}

