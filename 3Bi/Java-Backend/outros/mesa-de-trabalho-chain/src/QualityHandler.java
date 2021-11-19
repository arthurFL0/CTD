public abstract class QualityHandler {
    private QualityHandler proximoHandler;

    public abstract void verificaEstado(Produto produto);

    public QualityHandler getProximoHandler() {
        return proximoHandler;
    }

    public void setProximoHandler(QualityHandler proximoHandler) {
        this.proximoHandler = proximoHandler;
    }

}
