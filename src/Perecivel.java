public class Perecivel extends Alimentos{
    String datavalidade;
    
    @Override
    public double valorReal(){
        this.preco -= this.preco * 0.2;
        return preco;
    }

    public Perecivel(String produto, String marca, int quantidade, String datavalidade, double preco){
        super(produto, marca, quantidade, preco);
        this.datavalidade = datavalidade;
    }

    public String toString(){
        return "Produto: " + this.produto + ", Marca: " + this.marca + ", Quantidade: " + this.quantidade + ", Preço: R$ " + this.valorReal() + ", Validade: " + this.datavalidade;
    }
}