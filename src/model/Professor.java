package model;

public class Professor extends Pessoa {
    private long numCadastro;
    private String disciplina;

    // Construtores
    public Professor() {

    }

    public Professor(String nome, String email, String cpf, String disciplina) {
        super(nome, email, cpf);
        this.disciplina = disciplina;
    }

    // Getters e Setters
    public long getNumCadastro() {
        return numCadastro;
    }

    public void setNumCadastro(long numCadastro) {
        this.numCadastro = numCadastro;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    // Métodos
    @Override
    public String toString() {
        return String.format(
                "Nome do professor: %s%n" +
                        "E-mail do professor: %s%n" +
                        "CPF do professor: %s%n" +
                        "Número do cadastro: %d%n" +
                        "Disciplina: %s%n" +
                this.getNome(),
                this.getEmail(),
                this.getCpf(),
                this.getNumCadastro(),
                this.getDisciplina());
    }
}
