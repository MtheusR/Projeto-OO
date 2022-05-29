import java.util.ArrayList;

public class ColecaoFuncionario implements ContratoFuncionario {
    ArrayList<Funcionario> listafunc = new ArrayList<Funcionario>();

    public void adicionarFunc(Funcionario f){
        listafunc.add(f);
        System.out.printf("\nFuncionario %s adicionado!", f.nome);
    }

    public void removerFunc(Funcionario f){
        listafunc.remove(f);
        System.out.printf("\nFuncionario %s removido!", f.nome);
    }

    public void procurarFuncionario(String func){
        int n = listafunc.size(); int i;
        for (i=0; i<n; i++){
            Funcionario f = (Funcionario) listafunc.get(i);
            if (f.getCpf().equals(func)){
                System.out.println("\n" + listafunc.get(i));
                break;
            }else{System.out.println("\nNão foi encontrado O Funcionário com o CPF: " + func);}
        }
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
