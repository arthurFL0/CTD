package Pessoas;

import Informacoes.Endereco;


public class PessoaGenerico {
    protected String nome;
    protected String cpf;
    protected String telefone;
    protected Endereco endereco;
    protected String sexo;
    protected String email;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setSexo(String sexo) {
        if (sexo == "M" || sexo == "F") {
            this.sexo = sexo;
        } else
            System.out.println("Somente os caracteres 'M' e 'F' podem ser inseridos");
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEmail() {
        return email;
    }
}
