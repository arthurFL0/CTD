public class Estagiario extends Vendedor{
    public Estagiario(String nome){
        super.nome = nome;
        super.tipo = 'e';
        super.pontosPorVenda = 5;

    }

    @Override
    public int calcularPontos() {
        return this.vendas * pontosPorVenda;
    }
}
