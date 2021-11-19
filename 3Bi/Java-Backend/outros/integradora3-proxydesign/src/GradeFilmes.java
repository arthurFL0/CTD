public class GradeFilmes implements  IGradeFilmes{

    @Override
    public Filme getFilme(String nomeFilme) {
        Filme filme = null;
        switch (nomeFilme) {
            case "Titanic":
                filme = new Filme("Titanic", "argentina", "www.titanic.com.br");
                break;
            case "Matrix":
                filme = new Filme("Matrix", "brasil", "www,matrix.com.br");
                break;
            case "Flashdance":
                filme = new Filme("Flashdance","colombia","www.flashdance.com.co");
                break;
            case "Tropa de Elite":
                filme = new Filme("Tropa de Elite","brasil","www.tropadeelite.com.br");
                break;
        }

        return filme;
    }
}
