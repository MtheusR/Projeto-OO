public class Perecivel extends Alimentos{
    String datavalidade;

    public Perecivel(String produto, String marca, int quantidade, String datavalidade, double preco){
        super(produto, marca, quantidade, preco);
        this.datavalidade = datavalidade;
    }

    //Sobrescrita
    @Override
    public String toString(){
        return "Produto: " + this.produto + ", Marca: " + this.marca + ", Quantidade: " + this.quantidade + ", Preço: R$ " + this.preco + ", Validade: " + this.datavalidade;
    }
}