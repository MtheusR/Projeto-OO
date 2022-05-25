public class Perecivel extends Alimentos{
    String datavalidade;
    
    public Perecivel(String produto, String marca, int quantidade, String datavalidade){
        super(produto, marca, quantidade);
        this.datavalidade = datavalidade;
    }

    public String toString(){
        return "Produto: " + this.produto + ", Marca: " + this.marca + ", Quantidade: " + this.quantidade + ", Validade: " + this.datavalidade;
    }
}


//CHamar uma coisa dentro da outra