public class UsuarioJogo {
  private  String nome;
  private  String nickname;
  private  int pontuacao;
  private  int nivel;

//  Os dados primitivos "int" iniciam com "0" quando nao especificado os seu valores, ja a class Wrapper integer vai ficar null se nada for especificado
//  Eu criei esse metodo vazio pois assim eu consigo criar um objeto vazio, sem precisar usar o construtor ja passando parametros

    public UsuarioJogo(){

    }
    public UsuarioJogo(String nome, String nickname){
        this.nome = nome;
        this.nickname = nickname;
    };

    public void aumentarPontuacao(){
        this.pontuacao ++;
    }

    public void subirNivel(){
        this.nivel ++;
    }

    public void bonusUp(int valor_bonus){
        this.pontuacao + int vaor_bonus;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNome() {
        return nome;
    }
}
