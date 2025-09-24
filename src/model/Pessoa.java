package model;

public abstract class Pessoa {
    private String nome;
    private String email;
    private String cpf;
    protected boolean cadastroAtivo;

    // Construtores
    public Pessoa() {

    }

    public  Pessoa(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.cadastroAtivo = true;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isCadastroAtivo() {
        return cadastroAtivo;
    }

    public void setCadastroAtivo(boolean cadastroAtivo) {
        this.cadastroAtivo = cadastroAtivo;
    }

    // Métodos
    public abstract void desativarCadastro();

    public abstract void ativarCadastro();

}
