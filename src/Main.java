//- instanceof (ok)
//- pesquisar (falta implementar)
//- delet (fazer)
//- menu (feito ?)
//- arrumar código

public class Main {
    public static void main(String[] args) throws Exception {
        
        ColecaoFuncionario listafunc = new ColecaoFuncionario();
        ColecaoNaoPerecivel listaNaoPerecivel = new ColecaoNaoPerecivel();
        ColecaoPerecivel listaPerecivel = new ColecaoPerecivel();
        ColecaoNotaFiscal listaNotas = new ColecaoNotaFiscal();

        NaoPerecivel np1 = new NaoPerecivel("Batata-Frita", "BatataSP", 30);
        if (np1 instanceof NaoPerecivel){
            listaNaoPerecivel.addNaoPerecivel(np1);
            listaNaoPerecivel.printColecaoNaoPerecivel();
        }


        Perecivel p1 = new Perecivel("Batata", "BataRJ", 3, "26/05/2022");
        if (p1 instanceof Perecivel){
            listaPerecivel.addPerecivel(p1);
            listaPerecivel.printColecaoPerecivel();
        }



        Funcionario f1 = new Funcionario("Matheus Robert", "12522173405");
        if (f1 instanceof Funcionario){
            listafunc.addFunc(f1);
            listafunc.printColecaoFunc();
        }


        NotaFiscal nf1 = new NotaFiscal("24/05/2022", f1, np1, 2);
        if (nf1 instanceof NotaFiscal){
            listaNotas.criarNotaFiscal(nf1);
            listaNotas.printarColecaoNotaFiscal();
        }

        //listaNaoPerecivel.procurarNaoPerecivel();
        //listaPerecivel.procurarPerecivel();

    }
}