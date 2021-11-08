package model;

public class Dentista {

    private Integer id;
    private int numeroMatricula;
    private String nome;
    private String sobrenome;

    public Dentista(Integer id, int numeroMatricula, String nome, String sobrenome) {
        this.id = id;
        this.numeroMatricula = numeroMatricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Dentista(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return "Dentista{" +
                "id=" + id +
                ", numeroMatricula=" + numeroMatricula +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }
}
