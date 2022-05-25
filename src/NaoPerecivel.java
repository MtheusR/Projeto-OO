public class NaoPerecivel extends Alimentos {
    public NaoPerecivel (String produto, String marca, int quantidade){
        super(produto, marca, quantidade);
    }

    public String toString(){
        return "Produto: " + this.produto + ", Marca: " + this.marca + ", Quantidade: " + this.quantidade;
    }
}
