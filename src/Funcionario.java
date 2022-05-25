public class Funcionario {
    String nome;
    private String cpf;

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }

    public Funcionario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String toString(){
        return "Nome: " + this.nome + ", CPF: " + getCpf();
    }
}
