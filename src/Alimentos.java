public class Alimentos {
    String produto;
    String marca;
    int quantidade;
    double preco;

    public Alimentos(String produto, String marca, int quantidade, double preco) {
        this.produto = produto;
        this.marca = marca;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String toString(){
        return "Produto: " + this.produto + ", Marca: " + this.marca + ", Quantidade: " + this.quantidade + ", Preço: R$ " + this.preco;
    }
}
