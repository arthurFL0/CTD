public class SerieProxy implements ISerie {
    private int contador;
    private Serie series = new Serie();

    @Override
    public String getSerie(String nome) throws SerieNaoHabilitadaException {
        contador++;
        if (contador > 5) {
            throw new SerieNaoHabilitadaException("Não foi possivel acessar a url de" + " " + nome + " " + "pois o limite semanal foi atingido.");
        }else
            return series.getSerie(nome);

    }
}

