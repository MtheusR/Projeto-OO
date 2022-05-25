public class App {
    //    Referencia
    //    Private atributo
    //    Modificador de acesso
    //    CRUD (create, Retrieve, Update, Delete)
    //

    public static void main(String[] args) throws Exception {
        ColecaoFuncionario listafunc = new ColecaoFuncionario();
        ColecaoNaoPerecivel listaNaoPerecivel = new ColecaoNaoPerecivel();
        ColecaoPerecivel listaPerecivel = new ColecaoPerecivel();

        NaoPerecivel n1 = new NaoPerecivel("Batata-Frita", "BatataSP", 30);
        listaNaoPerecivel.addNaoPerecivel(n1);
        listaNaoPerecivel.printColecaoNaoPerecivel();

        Perecivel p1 = new Perecivel("Batata", "BataRJ", 3, "26/05/2022");
        listaPerecivel.addPerecivel(p1);
        listaPerecivel.printColecaoPerecivel();

        Funcionario f1 = new Funcionario("Matheus Robert", "12522173405");
        listafunc.addFunc(f1);
        listafunc.printColecaoFunc();

    }
}
