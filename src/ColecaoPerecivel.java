import java.util.ArrayList;

public class ColecaoPerecivel implements ContratoPerecivel {
    ArrayList<Perecivel> listaPerecivel = new ArrayList<Perecivel>();

    public void addPerecivel(Perecivel p){
        listaPerecivel.add(p);
    }

    public void removerPerecivel(Perecivel p){
        listaPerecivel.remove(p);
    }

    public void printColecaoPerecivel(){
        int i;
        System.out.println("\n\n-- Lista de Alimentos Pereciveis --");
        int n = listaPerecivel.size();
        for (i=0; i<n; i++){
            System.out.printf("#%d# %s", i+1, listaPerecivel.get(i));
        }
    }   
}
