public abstract class CargoBase {
    protected CargoBase proximoFuncionario;

    public void setProximoFuncionario(CargoBase proximoFuncionario) {
        this.proximoFuncionario = proximoFuncionario;
    }

    public abstract void lerDocumento(Documento doc);

}
