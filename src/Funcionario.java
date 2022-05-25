public class Funcionario {
    String nome;
    String cpf;

    public Funcionario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String toString(){
        return "Nome: " + this.nome + ", CPF: " + this.cpf;
    }
}
