public class Alimentos {
    String produto;
    String marca;
    int quantidade;
    double preco;

    public double valorReal(){
        this.preco -= this.preco * 0.1;
        return preco;
    }

    public Alimentos(String produto, String marca, int quantidade, double preco) {
        this.produto = produto;
        this.marca = marca;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}
