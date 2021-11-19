import java.util.ArrayList;

public class Documento {
    private int id;
    private String url;
    private String conteudo;
    private ArrayList<String> usuarios;

    public Documento(int id, String url, String conteudo) {
        this.id = id;
        this.url = url;
        this.conteudo = conteudo;
    }

    public void setUsuarios(ArrayList<String> usuarios) {
        this.usuarios = usuarios;
    }

    public int getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getConteudo() {
        return conteudo;
    }

    public ArrayList<String> getUsuarios() {
        return usuarios;
    }
}
