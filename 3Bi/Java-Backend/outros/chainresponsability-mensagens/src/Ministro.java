public class Ministro extends CargoBase {
    protected int tipoAcesso;

    public Ministro() {
        this.tipoAcesso = 2;
    }

    @Override
    public void lerDocumento(Documento doc) {
        int tipoDoc = doc.getTipo();
        if (this.tipoAcesso < tipoDoc) {
            this.proximoFuncionario.lerDocumento(doc);
        } else {
            System.out.println("O ministro leu o conteudo e o repassou para o proximo da cadeia");
            this.proximoFuncionario.lerDocumento(doc);
        }
    }
}
