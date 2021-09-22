package mensagem;

public abstract class TransmissorMensagem {
    protected Remetente remetente;
    public void setRemetente(Remetente remetente) {
        this.remetente = remetente;
    }

    public abstract void enviar(String mensagem);
}
