import java.util.ArrayList;

public class ColecaoFuncionario implements ContratoFuncionario {
    ArrayList<Funcionario> listafunc = new ArrayList<Funcionario>();

    public void addFunc(Funcionario f){
        listafunc.add(f);
    }

    public void removerFunc(Funcionario f){
        listafunc.remove(f);
    }

    public void printColecaoFunc(){
        int i;
        System.out.println("\n\n-- Lista de Funcionários --");
        int n = listafunc.size();
        for (i=0; i<n; i++){
            System.out.printf("      #Funcionário %d#\n%s", i+1, listafunc.get(i));
        }
    }   
}
