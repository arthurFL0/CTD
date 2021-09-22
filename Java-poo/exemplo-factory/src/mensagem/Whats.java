package mensagem;

public class Whats extends TransmissorMensagem{

    @Override
    public void enviar(String mensagem) {
        System.out.println(remetente);
        System.out.println("ENVIANDO MENSAGEM VIA WHATS");
        System.out.println(mensagem);
    }
}
