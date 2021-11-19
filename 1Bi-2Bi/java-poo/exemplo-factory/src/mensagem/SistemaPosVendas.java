package mensagem;

public class SistemaPosVendas {
    public static void main(String[] args) {
        String tipoNotificao = "S";
        Remetente remetente = Remetente.newIntance();
        TransmissorMensagem posVendas = FabricaMensagem.transmissor(tipoNotificao);
        posVendas.setRemetente(remetente);
        posVendas.enviar("OLA TUDO BEM, O QUE ESTA ACHANDO DO CARRO?");
    }
}
