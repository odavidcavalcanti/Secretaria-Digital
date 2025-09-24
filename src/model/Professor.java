package model;

public class Professor extends Pessoa {
    private long numCadastro;
    private String disciplina;

    // Construtores
    public Professor() {

    }

    public Professor(String nome, String email, String cpf, long numCadastro, String disciplina) {
        super(nome, email, cpf);
        this.numCadastro = numCadastro;
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
    public void ativarCadastro() {
        this.cadastroAtivo = true;
    }

    @Override
    public void desativarCadastro() {
        this.cadastroAtivo = false;
    }

    public String toString() {
        return String.format(
                "Nome do professor: %s%n" +
                        "E-mail do professor: %s%n" +
                        "CPF do professor: %s%n" +
                        "Número do cadastro: %d%n" +
                        "Disciplina: %s%n" +
                        "Cadastro ativo: %b",
                this.getNome(),
                this.getEmail(),
                this.getCpf(),
                this.getNumCadastro(),
                this.getDisciplina(),
                this.isCadastroAtivo());
    }
}
