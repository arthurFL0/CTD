public class GradeFilmesProxy implements IGradeFilmes{
    private GradeFilmes grade;
    private IP ip;


    public GradeFilmesProxy(GradeFilmes grade) {
        this.grade = grade;
    }

    public IP getIP(){
        return ip;
    }

    public void setIP(IP ip){
        this.ip = ip;
    }

    public void setGrade(GradeFilmes grade){
        this.grade = grade;
    }

    @Override
    public Filme getFilme(String nomeFilme) throws FilmeNaoHabilitadoException {
        Filme filme = grade.getFilme(nomeFilme);
        if(!(getIP().getPais().equalsIgnoreCase((filme.getPais())))){
            throw new FilmeNaoHabilitadoException(nomeFilme+" "+"nao disponivel em"+" "+ getIP().getPais());
        }
        return filme;
    }
}
