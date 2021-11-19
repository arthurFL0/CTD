import java.util.ArrayList;

public class Funcionario extends Vendedor{
    private int anoAntiguidade;

    private ArrayList<Vendedor> afiliados = new ArrayList<>();

    public Funcionario(String nome, int anoAntiguidade){
        super.nome = nome;
        super.tipo = 'f';
        super.pontosPorVenda = 5;
        this.anoAntiguidade = anoAntiguidade;
    }
    //adicionar afiliado ao funcionario
    public void addAfiliado(Vendedor afiliado){
        this.afiliados.add(afiliado);
    }

    @Override
    public int calcularPontos(){
        return (this.afiliados.size()*10) + (this.anoAntiguidade * 5) + (this.vendas * 5);

    }
}
