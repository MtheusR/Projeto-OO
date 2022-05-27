import java.util.ArrayList;
import java.util.Scanner;

public class ColecaoPerecivel implements ContratoPerecivel {
    ArrayList<Alimentos> listaPerecivel = new ArrayList<Alimentos>();

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

    public void procurarPerecivel(){

        System.out.println("\n\nDigite o que você quer procurar: ");
        Scanner input = new Scanner(System.in);
        String pesq = input.next();

        int n = listaPerecivel.size(); int i;
        for (i=0; i<n; i++){
            Alimentos p = (Alimentos) listaPerecivel.get(i);
            if (p.produto.equals(pesq)){
                System.out.println(listaPerecivel.get(i));
            }else{System.out.println("Não foi encontrado: " + pesq);}
            input.close();
        }
    }   
}
