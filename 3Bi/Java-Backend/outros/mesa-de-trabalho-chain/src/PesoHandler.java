public class PesoHandler extends QualityHandler {
    @Override
    public void verificaEstado(Produto produto) {
        if(produto.getPeso() >= 1200 && produto.getPeso() <= 1300){
            this.getProximoHandler().verificaEstado(produto);
        }
        else{
            if(produto != null){
                System.out.println("O peso do produto é invalido.");
                produto.setStatus("Invalidado");
                this.getProximoHandler().verificaEstado(produto);
            }
        }
    }
}
