public class NotaFiscal {
    String dataNota;
    Funcionario funCaixa;
    Alimentos produtos;
    int quantidade;

    public NotaFiscal(String dataNota, Funcionario funCaixa, Alimentos item, int quantidade) {
        this.dataNota = dataNota;
        this.funCaixa = funCaixa;
        this.produtos = item;
        this.quantidade = quantidade;
        item.quantidade -= quantidade;
    }

    public String toString(){
        return "Data de transação: " + this.dataNota + "\nFuncionario " + this.funCaixa + "\nItens: " + this.produtos.produto + ", Marca: " + this.produtos.marca + "\nQuantidade: " + this.quantidade;
    }

}
