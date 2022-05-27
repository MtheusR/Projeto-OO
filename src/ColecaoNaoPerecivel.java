import java.util.ArrayList;
import java.util.Scanner;

public class ColecaoNaoPerecivel implements ContratoNaoPerecivel{
    ArrayList<Alimentos> listaNaoPerecivel = new ArrayList<Alimentos>();

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

    public void procurarNaoPerecivel(){

        System.out.println("\n\nDigite o que você quer procurar: ");
        Scanner input = new Scanner(System.in);
        String pesq = input.next();

        int n = listaNaoPerecivel.size(); int i;
        for (i=0; i<n; i++){
            Alimentos p = (Alimentos) listaNaoPerecivel.get(i);
            if (p.produto.equals(pesq)){
                System.out.println(listaNaoPerecivel.get(i));
            }else{System.out.println("Não foi encontrado: " + pesq);}
            input.close();
        }
    }    
    
}
