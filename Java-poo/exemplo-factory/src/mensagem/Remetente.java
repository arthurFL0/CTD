package mensagem;

public class Remetente {
    private static Remetente remetente;
    public static Remetente newIntance(){
        if(remetente==null){
            remetente = new Remetente();
            remetente.setNome("GLEYSON CAR");
            remetente.setTelefone("119665765");
        }
        return remetente;
    }

    private String nome;
    private String telefone;
    private Remetente(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Remetente{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
