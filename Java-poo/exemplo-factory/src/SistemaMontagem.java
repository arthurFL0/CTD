import fabrica.Montadora;
import fabrica.MontadoraCarroLuxo;
import fabrica.MontadoraCarroPopular;
import mensagem.FabricaMensagem;
import mensagem.Remetente;
import mensagem.TransmissorMensagem;
import veiculo.Carro;

public class SistemaMontagem {
    public static void main(String[] args) {
        String categoria="L";
        Montadora montadora = null;

        if(categoria.equals("P"))
            montadora = new MontadoraCarroPopular();
        else
            montadora = new MontadoraCarroLuxo();

        Carro carroMontado = montadora.montar();
        carroMontado.getCambio().trocarMarcha();
        carroMontado.getSom().tocar();

        String tipoNotificao = "S";
        Remetente remetente = Remetente.newIntance();

        TransmissorMensagem tm = FabricaMensagem.transmissor(tipoNotificao);
        tm.setRemetente(remetente);
        tm.enviar("SENHOR SEU VEICULO ESTÁ PRONTO");

    }
}
