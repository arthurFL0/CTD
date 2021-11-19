package mensagem;

public class FabricaMensagem {
    public static TransmissorMensagem transmissor(String tipo){
        if(tipo.equals("S"))
            return new SMS();
        else
            return new Whats();
    }
}
