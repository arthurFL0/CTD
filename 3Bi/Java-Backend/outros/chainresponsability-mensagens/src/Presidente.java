public class Presidente extends  CargoBase{
    protected int tipoAcesso;

    public Presidente() {
        this.tipoAcesso = 3;
    }

    @Override
    public void lerDocumento(Documento doc) {
            System.out.println("O presidente leu o conteudo");

    }
}

