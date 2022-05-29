public class NotaFiscal {
    String dataNota;
    Funcionario funCaixa;
    Alimentos produto;
    int quantidade;
    Alimentos preco;
    double valorTotal;

    public double valorTotal(int quantidade){
        valorTotal = this.preco.preco * quantidade;
        return valorTotal;
    }

    public NotaFiscal(String dataNota, Funcionario funCaixa, Alimentos item, int quantidade, Alimentos preco) {
        this.dataNota = dataNota;
        this.funCaixa = funCaixa;
        this.produto = item;
        this.quantidade = quantidade;
        item.quantidade -= quantidade;
        this.preco = preco;
        this.valorTotal = this.preco.preco * quantidade;
    }

    public String toString(){
        return "Data de transação: " + this.dataNota + "\nFuncionario " + this.funCaixa + "\nItens: " + this.produto.produto + ", Marca: " + this.produto.marca + "\nQuantidade: " + this.quantidade + "\nValor total: R$" + this.valorTotal;
    }


}
