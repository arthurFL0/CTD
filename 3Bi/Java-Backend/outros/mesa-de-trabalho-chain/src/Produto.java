public class Produto {
    private String nome;
    private int lote;
    private int peso;
    private String embalagem;
    private String status;

    public Produto(String nome, int lote, int peso, String embalagem) {
        this.nome = nome;
        this.lote = lote;
        this.peso = peso;
        this.embalagem = embalagem;
    }

    public int getLote() {
        return lote;
    }

    public int getPeso() {
        return peso;
    }



    public String getEmbalagem() {
        return embalagem;
    }

    public void setStatus(String a) {
         this.status = a;
    }

    public String getStatus() {
        return status;
    }
}
