public class LoteHandler extends QualityHandler {
    @Override
    public void verificaEstado(Produto produto) {
        if(produto.getLote() >=1000 && produto.getLote() <=2000){
            this.getProximoHandler().verificaEstado(produto);
        }
        else{
            if(produto != null){
                System.out.println("O lote do produto é invalido.");
                produto.setStatus("Invalidado");
                this.getProximoHandler().verificaEstado(produto);
            }
        }
    }
}
