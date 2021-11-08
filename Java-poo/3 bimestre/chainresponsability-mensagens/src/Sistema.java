public class Sistema {
    public static void main(String[] args) {
        Documento docsecreto = new Documento("O código é Java Beans ",2);
        Deputado deputado = new Deputado();
        Ministro ministro = new Ministro();
        Presidente presidente = new Presidente();

        deputado.setProximoFuncionario(ministro);
        ministro.setProximoFuncionario(presidente);

        deputado.lerDocumento(docsecreto);
    }
}
