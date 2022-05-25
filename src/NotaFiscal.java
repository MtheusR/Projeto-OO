public class NotaFiscal {
    String dataNota;
    Funcionario funCaixa;
    Alimentos produtos;
    int quantidade;

    public NotaFiscal(String dataNota, Funcionario funCaixa, Alimentos produtos, int quantidade) {
        this.dataNota = dataNota;
        this.funCaixa = funCaixa;
        this.produtos = produtos;
        this.quantidade = quantidade;
        produtos.quantidade -= quantidade;
    }

    public String toString(){
        return "Data de transação: " + this.dataNota + "\nFuncionario: " + this.funCaixa + "\nProdutos: " + this.produtos + "\nQuantidade removida: " + this.quantidade;
    }

}
