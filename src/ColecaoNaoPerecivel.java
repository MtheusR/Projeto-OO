import java.util.ArrayList;

public class ColecaoNaoPerecivel implements ContratoNaoPerecivel{
    ArrayList<NaoPerecivel> listaNaoPerecivel = new ArrayList<NaoPerecivel>();

    public void addNaoPerecivel(NaoPerecivel np){
        listaNaoPerecivel.add(np);
    }

    public void removerNaoPerecivel(NaoPerecivel np){
        listaNaoPerecivel.remove(np);
    }

    public void printColecaoNaoPerecivel(){
        int i;
        System.out.println("\n\n-- Lista de Alimentos Não Perecivel --");
        int n = listaNaoPerecivel.size();
        for (i=0; i<n; i++){
            System.out.printf("#%d# %s", i+1, listaNaoPerecivel.get(i));
        }
    } 
}
