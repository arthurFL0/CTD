public abstract class Vendedor {
    protected String nome;
    protected int vendas = 0;
    protected int pontosPorVenda;
    protected char tipo;

    public void vender(int qtdVendas) {
        this.vendas += qtdVendas;
    }

    public abstract int calcularPontos();

    public String mostrarCategoria() {
        int pontosDoVendedor = calcularPontos();
        return this.nome + " tem um total de " + pontosDoVendedor + " pontos e categoriza como " + getNomeCategoria(pontosDoVendedor);

    }

    private String getNomeCategoria(int pontosVendedor) {
        if (this.tipo != 'e') {
            if (pontosVendedor < 20) {
                return "vendedor novato";
            } else if (pontosVendedor < 31) {
                return "vendedor aprendiz";
            } else if (pontosVendedor < 41) {
                return "vendedor bom";
            } else {
                return "vendedor mestre";
            }
        }
        else {
            if (pontosVendedor < 50) {
                return "estagiário novato";
            } else {
                return "estagiário experiente";
            }
        }
    }
}

