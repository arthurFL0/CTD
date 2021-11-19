public class Documento {
    private String conteudo;
    private int tipo;

    public Documento(String conteudo, int tipo) {
        this.conteudo = conteudo;
        this.tipo = tipo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public int getTipo() {
        return tipo;
    }
}
