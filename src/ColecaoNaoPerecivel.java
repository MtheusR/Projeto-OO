import java.util.ArrayList;

public class ColecaoNaoPerecivel implements ContratoNaoPerecivel{
    ArrayList<Alimentos> listaNaoPerecivel = new ArrayList<Alimentos>();

    //Adicionando
    public void adicionarNaoPerecivel(NaoPerecivel np){
        listaNaoPerecivel.add(np);
        System.out.printf("\nAlimento [NP] %s adicionado!", np.produto);
    }

    //Removendo
    public void removerNaoPerecivel(NaoPerecivel np){
        listaNaoPerecivel.remove(np);
        System.out.printf("\nAlimento [NP] %s removido!", np.produto);
    }

    //Printando toda a lista de Não Perecivel
    public void printColecaoNaoPerecivel(){
        int i;
        System.out.println("\n\n-- Lista de Alimentos Não Perecivel --");
        int n = listaNaoPerecivel.size();
        for (i=0; i<n; i++){
            System.out.printf("\n#%d# %s", i+1, listaNaoPerecivel.get(i));
        }
    }

    //Procurando não perecivel
    public void procurarNaoPerecivel(String nnp){
        int n = listaNaoPerecivel.size(); int i;
        for (i=0; i<n; i++){
            Alimentos p = (Alimentos) listaNaoPerecivel.get(i);
            if (p.produto.equals(nnp)){
                System.out.println("\n" + listaNaoPerecivel.get(i));
                break;
            }else if(i+1 == n){System.out.println("\nNão foi encontrado: " + nnp);}
        }
    }    
    
}
