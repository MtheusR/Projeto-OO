/*
- DELETE (ok)
- MENU (ok)
- IMPUT.CLEAR(); PARA LIBERAR
- LOOPING DE ERRO PARA PESQUISAR
- IMPLEMENTAR TRY E CACTH
- FAZER UM DOC
- LIMPAR CÓDIGO / REVISAR
*/

import java.util.Scanner;
public class Main {

    public static void MenuInicial(){
        clear();
        System.out.print("\n\n|          ##-- MENU ISURA --##          |\n");
        System.out.print("|----------------------------------------|\n");
        System.out.print("| Opção \"1\" - Adicionar                  |\n");
        System.out.print("| Opção \"2\" - Pesquisar                  |\n");
        System.out.print("| Opção \"3\" - Produtos                   |\n");
        System.out.print("| Opção \"4\" - Remoção de dados           |\n");
        System.out.print("| Opção \"5\" - Sair                       |\n");
        System.out.print("|----------------------------------------|\n");
        System.out.print("Digite uma opção: ");
    }

    public static void MenuBuscar(){
        clear();
        System.out.print("\n\n|       ##-- MENU PESQUISAR --##         |\n");
        System.out.print("|----------------------------------------|\n");
        System.out.print("| Opção \"1\" - Perecível                  |\n");
        System.out.print("| Opção \"2\" - Não Perecível              |\n");
        System.out.print("| Opção \"3\" - Sair                       |\n");
        System.out.print("|----------------------------------------|\n");
        System.out.print("Digite uma opção: ");
    }

    public static void MenuDeletar(){
        clear();
        System.out.print("\n\n|       ##-- MENU DELETAR --##         |\n");
        System.out.print("|--------------------------------------|\n");
        System.out.print("| Opção \"1\" - Perecível                |\n");
        System.out.print("| Opção \"2\" - Não Perecível            |\n");
        System.out.print("| Opção \"3\" - Sair                     |\n");
        System.out.print("|--------------------------------------|\n");
        System.out.print("Digite uma opção: ");
    }

    public static void clear(){
        for(int i = 0; i < 100; i++){
            System.out.println("");
        }
    }


    public static void main(String[] args) throws Exception {
        
        ContratoNotaFiscal listaNotas = new ColecaoNotaFiscal();
        ContratoFuncionario listafunc = new ColecaoFuncionario();
        ContratoNaoPerecivel listaNaoPerecivel = new ColecaoNaoPerecivel();
        ContratoPerecivel listaPerecivel = new ColecaoPerecivel();

        NaoPerecivel np1 = new NaoPerecivel("Biscoito de leite", "Treloso", 30);
        if (np1 instanceof NaoPerecivel){
            listaNaoPerecivel.addNaoPerecivel(np1);
        }
        
        NaoPerecivel np2 = new NaoPerecivel("Sal", "Maresia", 41);
        if (np2 instanceof NaoPerecivel){
            listaNaoPerecivel.addNaoPerecivel(np2);
        }

        //------------------------//

        Perecivel p1 = new Perecivel("Peito de frango", "Mauriceia", 10, "30/08/2022");
        if (p1 instanceof Perecivel){
            listaPerecivel.addPerecivel(p1);
        }

        Perecivel p2 = new Perecivel("Achocolatado", "Nescau",  50, "26/06/2022");
        if (p2 instanceof Perecivel){
            listaPerecivel.addPerecivel(p2);
        }

        //------------------------//

        Funcionario f1 = new Funcionario("Matheus Robert", "12522173405");
        if (f1 instanceof Funcionario){
            listafunc.addFunc(f1);
        }

        Funcionario f2 = new Funcionario("Pedro Henrique", "16513456884");
        if (f2 instanceof Funcionario){
            listafunc.addFunc(f2);
        }

        //------------------------//

        MenuInicial();
        Scanner input = new Scanner(System.in);
        String op = input.nextLine();
        int opconvertido = Integer.parseInt(op);
        while (opconvertido <= 4){

            switch (opconvertido){
                case 1:
                    NaoPerecivel np3 = new NaoPerecivel("Oleo de Soja", "Girassol", 35);
                    if (np3 instanceof NaoPerecivel){
                        listaNaoPerecivel.addNaoPerecivel(np3);
                    }
                
                    Perecivel p3 = new Perecivel("Iorgute", "Danone", 10, "20/07/2022");
                    if (p3 instanceof Perecivel){
                        listaPerecivel.addPerecivel(p3);
                    }    

                    Funcionario f3 = new Funcionario("Bia Torres Neris", "16453498456");
                    if (f3 instanceof Funcionario){
                        listafunc.addFunc(f3);
                    }

                break;
                
                case 2:
                    MenuBuscar();
                    String op2 = input.nextLine();
                    int opconvertido2 = Integer.parseInt(op2);
                    
                    while(opconvertido2 <= 2){
                        switch (opconvertido2){
                            case 1:
                                String pesq = input.nextLine();
                                listaPerecivel.procurarPerecivel(pesq);
                                input.nextLine();
                            break;
    
                            case 2:
                                pesq = input.nextLine();
                                listaNaoPerecivel.procurarNaoPerecivel(pesq);
                                input.nextLine();
                            break;
                        }

                        MenuBuscar();
                        op2 = input.nextLine();
                        opconvertido2 = Integer.parseInt(op2);
                    }
                    
                break;
                
                case 3:
                    NotaFiscal nf1 = new NotaFiscal("24/05/2022", f1, np1, 2);
                    if (nf1 instanceof NotaFiscal){
                        listaNotas.criarNotaFiscal(nf1);
                        clear();
                        listaNotas.printarColecaoNotaFiscal();
                        System.out.println("\n");
                        listaNaoPerecivel.printColecaoNaoPerecivel();
                    }
                break;

                case 4:
                    MenuDeletar();
                    int op3 = input.nextInt();
                    while(op3 <= 2){
                        switch (op3){
                            case 1:
                                listaPerecivel.removerPerecivel(p1);
                                listaPerecivel.printColecaoPerecivel();
                            break;
    
                            case 2:
                                listaNaoPerecivel.removerNaoPerecivel(np1);
                                listaNaoPerecivel.printColecaoNaoPerecivel();
                            break;
                        }
                        MenuDeletar();
                        op3 = input.nextInt();       
                    }
                break;
            }
            MenuInicial();
            op = input.nextLine();
            opconvertido = Integer.parseInt(op);
            
        }
        System.exit(0);
        input.close();
    }
}