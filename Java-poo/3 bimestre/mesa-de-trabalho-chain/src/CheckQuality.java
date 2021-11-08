public class CheckQuality {
    private QualityHandler inicial;

    public CheckQuality(){
        this.inicial= new LoteHandler();
        QualityHandler peso = new PesoHandler();
        QualityHandler embalagem = new EmbalagemHandler();

        this.inicial.setProximoHandler(peso);
        peso.setProximoHandler(embalagem);
    }

    public void verificador(Produto produto){
        this.inicial.verificaEstado(produto);
    }
}
