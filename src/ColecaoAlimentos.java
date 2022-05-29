import java.util.ArrayList;

public class ColecaoAlimentos {

    ArrayList<Alimentos> listaAlimentos = new ArrayList<Alimentos>();
    
    public void adicionarAlimento(Alimentos a){
        listaAlimentos.add(a);
    }

    public void removerAlimento(Alimentos a){
        listaAlimentos.remove(a);
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
