package Elementos;

public class Musica {
    private String nome;
    private String artista;
    private String genero;

    public Musica(String nome, String artista, String genero) {
        this.nome = nome;
        this.artista = artista;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
