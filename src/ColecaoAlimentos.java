import java.util.ArrayList;

public class ColecaoAlimentos {

    ArrayList<Alimentos> listaAlimentos = new ArrayList<Alimentos>();

    
    public void adicionarAlimento(NaoPerecivel anp){
        listaAlimentos.add(anp);
    }

    public void adicionarAlimento(Perecivel ap){
        listaAlimentos.add(ap);
    }

    public void removerAlimento(NaoPerecivel anp){
        listaAlimentos.remove(anp);
    }

    public void removerAlimento(Perecivel ap){
        listaAlimentos.remove(ap);
    }

    public void printarColecaoAlimentos() {
        int i;
        System.out.println("\n\n-- Lista de Alimentos --");
        int n = listaAlimentos.size();
        for (i=0; i<n; i++){
            System.out.printf("\n      #Alimento %d#\n%s", i+1, listaAlimentos.get(i));
        }
    }

}
