import java.util.ArrayList;

public class ColecaoAlimentos {
    
    //Sobrecarga
    //Criando coleção
    ArrayList<Alimentos> listaAlimentos = new ArrayList<Alimentos>();

    /*public void adicionarAlimento(Alimentos a){
        listaAlimentos.add(a);
    }*/
    
    //Adicionando
    public void adicionarAlimento(NaoPerecivel anp){
        listaAlimentos.add(anp);
    }

    //Adicionando
    public void adicionarAlimento(Perecivel ap){
        listaAlimentos.add(ap);
    }

    //Removendo
    public void removerAlimento(NaoPerecivel anp){
        listaAlimentos.remove(anp);
    }

    //Removendo
    public void removerAlimento(Perecivel ap){
        listaAlimentos.remove(ap);
    }

    //Printando toda a lista
    public void printarColecaoAlimentos() {
        int i;
        System.out.println("\n\n-- Lista de Alimentos --");
        int n = listaAlimentos.size();
        for (i=0; i<n; i++){
            System.out.printf("\n      #Alimento %d#\n%s", i+1, listaAlimentos.get(i));
        }
    }

}
