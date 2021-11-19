public class ArvoreDTO {
    private int altura;
    private int largura;
    private String cor;

    public ArvoreDTO(String tipo) {
        switch(tipo){
            case "ornamental":
                this.altura = 200;
                this.largura = 400;
                this.cor = "verde";
                break;
            case "frutifera":
                this.altura = 500;
                this.largura = 300;
                this.cor = "vermelho";
                break;
            case "florifera":
                this.altura = 100;
                this.largura = 200;
                this.cor = "azul";
                break;

        }
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
