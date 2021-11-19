import java.util.Calendar;

public class Cachorro {
    private boolean tem_nome;
    private boolean disponibilidade;
    private int ano;
    private double peso;
    private String raca;
    private boolean chip;
    private boolean machucado;


    public void perderDog(){
            if(this.chip == true)
             System.out.println("O cachorro pode ser perdido");
            else
             System.out.println("O cachorro nao pode ser perdido");
    }

    public String poderAdotar(){
        if(this.machucado == false  && this.disponibilidade == true && this.peso > 5)
        return "Pode ser adotado";
        else
        return "Não pode ser adotado";
    }

    public void setTem_nome(boolean tem_nome) {
        this.tem_nome = tem_nome;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIdade(){

        // Aqui um objeto da classe Calendar chamado "atual" é criado para obter a data atual.
        // Calendar é uma classe abstrata e por isso deve se usar o .getInstance em vez do "new Calendar()" para criar um objeto.
        // Depois atual.get(Calendar.YEAR) vai pegar o ano da data atual em formato int

        Calendar atual = Calendar.getInstance();
        int idade = atual.get(Calendar.YEAR) - this.ano;
        return idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public void setMachucado(boolean machucado) {
        this.machucado = machucado;
    }
}

