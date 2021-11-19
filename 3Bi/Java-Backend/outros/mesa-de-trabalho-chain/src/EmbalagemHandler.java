public class EmbalagemHandler extends QualityHandler {
    @Override
    public void verificaEstado(Produto produto) {
        if(produto.getStatus() != "Invalidado"  && produto.getEmbalagem() == "Saudavel" || produto.getEmbalagem() == "Quase Saudavel"){
            System.out.println("O produto atendeu a todos os quesitos e foi aceito");
        }else if(produto.getEmbalagem() != "Saudavel" && produto.getEmbalagem() != "Quase Saudavel"){
            System.out.println("A embalagem do produto tem qualidade inferior ao padrao. O produto foi reijeitado");
        }else{
            System.out.println("O produto foi rejeitado.");
        }

    }
}

