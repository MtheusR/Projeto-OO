public class NaoPerecivel extends Alimentos {
    public NaoPerecivel (String produto, String marca, int quantidade, double preco){
        super(produto, marca, quantidade, preco);
    }

    public String toString(){
        return "Produto: " + this.produto + ", Marca: " + this.marca + ", Quantidade: " + this.quantidade + ", Preço: R$ " + this.valorReal();
    }
}
