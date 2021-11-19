public class Sistema {
    public static void main(String[] args) {

//  Aqui eu crio um objeto UsuarioJogo vazio para depois preencher ele com os Setters e Getters
    UsuarioJogo user1 = new UsuarioJogo();

    user1.setNickname("gamer_extreme420");
    user1.setNome("Bob");

    user1.aumentarPontuacao();
    user1.aumentarPontuacao();

    user1.subirNivel();

        System.out.println("Nickname:"+user1.getNome()+" "+"Nivel:"+user1.getNivel()+" "+"Pontuacao:"+user1.getPontuacao());


//  Aqui eu uso o método construtor da classe para criar um objeto já com alguns atributos definidos
    UsuarioJogo user2 = new UsuarioJogo("Pablo","pablin-atirador");

    user2.aumentarPontuacao();
    user2.aumentarPontuacao();
    user2.bonusUp(2);

    user2.subirNivel();
    user2.subirNivel();

    System.out.println("Nickname:"+user2.getNome()+" "+"Nivel:"+user2.getNivel()+" "+"Pontuacao:"+user2.getPontuacao());
    }

}
