package mensagem;

public class SMS extends TransmissorMensagem {
    @Override
    public void enviar(String mensagem) {
        System.out.println(remetente);
        System.out.println("ENVIANDO MENSAGEM VIA SMS");
        System.out.println(mensagem);
    }
}
