public class Deputado extends CargoBase {
    protected int tipoAcesso;

    public Deputado() {
        this.tipoAcesso = 1;
    }

    @Override
    public void lerDocumento(Documento doc) {
        int tipoDoc = doc.getTipo();
        if (this.tipoAcesso < tipoDoc) {
            this.proximoFuncionario.lerDocumento(doc);
        } else {
            System.out.println("O deputado leu o conteudo e o repassou para o proximo da cadeia");
            this.proximoFuncionario.lerDocumento(doc);

        }
    }
}