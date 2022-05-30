import java.util.ArrayList;


public class ColecaoPerecivel implements ContratoPerecivel {
    ArrayList<Alimentos> listaPerecivel = new ArrayList<Alimentos>();
    

    public void adicionarPerecivel(Perecivel p){
        listaPerecivel.add(p);
        System.out.printf("\nAlimento [P] %s adicionado!", p.produto);

    }

    public void removerPerecivel(Perecivel p){
        listaPerecivel.remove(p);
        System.out.printf("\nAlimento [P] %s removido!", p.produto);
    }

    public void printColecaoPerecivel(){
        int i;
        System.out.println("\n\n-- Lista de Alimentos Pereciveis --");
        int n = listaPerecivel.size();
        for (i=0; i<n; i++){
            System.out.printf("\n#%d# %s", i+1, listaPerecivel.get(i));
        }
    }

    public void procurarPerecivel(String pp){
        int n = listaPerecivel.size(); int i;
        for (i=0; i<n; i++){
            Alimentos p = (Alimentos) listaPerecivel.get(i);
            if (p.produto.equals(pp)){
                System.out.println("\n" + listaPerecivel.get(i));
                break;
            }else if(i++ == n){System.out.println("\nNão foi encontrado: " + pp);}
            
        }
        
    }
}
