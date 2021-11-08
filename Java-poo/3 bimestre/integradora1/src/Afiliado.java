public class Afiliado extends  Vendedor{
    public Afiliado(String nome){
        super.nome = nome;
        super.tipo = 'a';
        super.pontosPorVenda = 15;

    }

    @Override
    public int calcularPontos(){
        return this.vendas * pontosPorVenda;
    }
}
