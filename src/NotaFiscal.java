public class NotaFiscal {
    String dataNota;
    Funcionario funCaixa;//f1
    Alimentos produto, preco;//np1
    int quantidadePedido;
    double valorTotal;

    public NotaFiscal(String dataNota, Funcionario funCaixa, Alimentos item, int quantidadePedido, Alimentos preco) {
        this.dataNota = dataNota;
        this.funCaixa = funCaixa;
        this.produto = item;
        this.quantidadePedido = quantidadePedido;
        item.quantidade -= quantidadePedido;
        this.preco = preco;
        this.valorTotal = preco.preco * quantidadePedido;

    }

    public String toString(){
        return "Data de transação: " + this.dataNota + "\nFuncionario " + this.funCaixa + "\nItens: " + this.produto.produto + ", Marca: " + this.produto.marca + "\nQuantidade: " + this.quantidadePedido + "\nValor total: R$" + this.valorTotal;
    }


}
