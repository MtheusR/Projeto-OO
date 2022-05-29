/*
- CAST E INSTANCEOF
- *FAZER UM DOC
- SOBRE CARGA
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
        System.out.print("| Opção \"5\" - Estoque                    |\n");
        System.out.print("| Opção \"6\" - Sair                       |\n");
        System.out.print("|----------------------------------------|\n");
        System.out.print("Digite uma opção: ");
    }

    public static void MenuPesquisar(){
        clear();
        System.out.print("\n\n|       ##-- MENU PESQUISAR --##         |\n");
        System.out.print("|----------------------------------------|\n");
        System.out.print("| Opção \"1\" - Perecível                  |\n");
        System.out.print("| Opção \"2\" - Não Perecível              |\n");
        System.out.print("| Opção \"3\" - Funcionarios               |\n");
        System.out.print("| Opção \"4\" - Sair                       |\n");
        System.out.print("|----------------------------------------|\n");
        System.out.print("Digite uma opção: ");
    }

    public static void MenuDeletar(){
        clear();
        System.out.print("\n\n|       ##-- MENU DELETAR --##         |\n");
        System.out.print("|--------------------------------------|\n");
        System.out.print("| Opção \"1\" - Perecível                |\n");
        System.out.print("| Opção \"2\" - Não Perecível            |\n");
        System.out.print("| Opção \"3\" - Funcionarios             |\n");
        System.out.print("| Opção \"4\" - Sair                     |\n");
        System.out.print("|--------------------------------------|\n");
        System.out.print("Digite uma opção: ");
    }

    public static void MenuPrintar(){
        clear();
        System.out.print("\n\n|    ##-- MENU VISUALIZAR --##     |\n");
        System.out.print("|--------------------------------------|\n");
        System.out.print("| Opção \"1\" - Alimentos                |\n");
        System.out.print("| Opção \"3\" - Funcionarios             |\n");
        System.out.print("| Opção \"4\" - Sair                     |\n");
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
        ColecaoAlimentos listaAlimentos = new ColecaoAlimentos();

        NaoPerecivel np1 = new NaoPerecivel("Biscoito de leite", "Treloso", 30, 1.85);
        if (np1 instanceof NaoPerecivel){
            listaNaoPerecivel.adicionarNaoPerecivel(np1);
            listaAlimentos.adicionarAlimento(np1);
        }
        
        NaoPerecivel np2 = new NaoPerecivel("Sal", "Maresia", 41, 1.50);
        if (np2 instanceof NaoPerecivel){
            listaNaoPerecivel.adicionarNaoPerecivel(np2);
            listaAlimentos.adicionarAlimento(np2);;
        }

        Perecivel p1 = new Perecivel("Peito de frango", "Mauricea", 10, "30/08/2022", 15.0);
        if (p1 instanceof Perecivel){
            listaPerecivel.adicionarPerecivel(p1);
            listaAlimentos.adicionarAlimento(p1);
        }

        Perecivel p2 = new Perecivel("Achocolatado", "Nescau",  50, "26/06/2022", 6.0);
        if (p2 instanceof Perecivel){
            listaPerecivel.adicionarPerecivel(p2);
            listaAlimentos.adicionarAlimento(p2);
        }

        Funcionario f1 = new Funcionario("Matheus Robert", "12522173405");
        if (f1 instanceof Funcionario){
            listafunc.adicionarFunc(f1);
        }

        Funcionario f2 = new Funcionario("Pedro Henrique", "16513456884");
        if (f2 instanceof Funcionario){
            listafunc.adicionarFunc(f2);
        }

        MenuInicial();
        Scanner input = new Scanner(System.in);
        String op = input.nextLine();
        int opconvertido = Integer.parseInt(op);
        while (opconvertido <= 5){

            switch (opconvertido){
                case 1:
                    NaoPerecivel np3 = new NaoPerecivel("Oleo de Soja", "Girassol", 35, 18.0);
                    if (np3 instanceof NaoPerecivel){
                        listaNaoPerecivel.adicionarNaoPerecivel(np3);
                        listaAlimentos.adicionarAlimento(np3);
                    }
                
                    Perecivel p3 = new Perecivel("Iorgute", "Danone", 10, "20/07/2022", 6.50);
                    if (p3 instanceof Perecivel){
                        listaPerecivel.adicionarPerecivel(p3);
                        listaAlimentos.adicionarAlimento(p3);
                    }    

                    Funcionario f3 = new Funcionario("Bia Torres Neris", "16453498456");
                    if (f3 instanceof Funcionario){
                        listafunc.adicionarFunc(f3);
                    }

                break;
                
                case 2:
                    MenuPesquisar();
                    String op2 = input.nextLine();
                    int opconvertido2 = Integer.parseInt(op2);
                    
                    while(opconvertido2 <= 3){
                        switch (opconvertido2){
                            case 1:
                                System.out.print("\nDigite o alimento desejado: ");
                                String pesq = input.nextLine();
                                listaPerecivel.procurarPerecivel(pesq);

                            break;
    
                            case 2:
                                System.out.print("\nDigite o alimento desejado: ");
                                pesq = input.nextLine();
                                listaNaoPerecivel.procurarNaoPerecivel(pesq);

                            break;

                            case 3:
                                System.out.print("\nDigite o CPF do Funcionario desejado: ");
                                pesq = input.nextLine();
                                listafunc.procurarFuncionario(pesq);

                            break;
                        }

                        MenuPesquisar();
                        op2 = input.nextLine();
                        opconvertido2 = Integer.parseInt(op2);
                    }
                    
                break;
                
                case 3:
                    NotaFiscal nf1 = new NotaFiscal("24/05/2022", f1, np1, 2, np1);
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
                    String op3 = input.nextLine();
                    int opconvertido3 = Integer.parseInt(op3);
                    while(opconvertido3 <= 3){
                        switch (opconvertido3){
                            case 1:
                                listaPerecivel.removerPerecivel(p1);
                                listaAlimentos.removerAlimento(p1);
                                listaPerecivel.printColecaoPerecivel();
                            break;
    
                            case 2:
                                listaNaoPerecivel.removerNaoPerecivel(np1);
                                listaAlimentos.removerAlimento(np1);
                                listaNaoPerecivel.printColecaoNaoPerecivel();
                            break;

                            case 3:
                                listafunc.removerFunc(f1);
                                listafunc.printColecaoFunc();
                        }
                        MenuDeletar();
                        op3 = input.nextLine();
                        opconvertido3 = Integer.parseInt(op3);    
                    }
                break;

                case 5:
                    MenuPrintar();
                    String op4 = input.nextLine();
                    int  opconvertido4 = Integer.parseInt(op4);
                    while(opconvertido4 <= 2){
                        switch (opconvertido4){
                            case 1:
                                listaAlimentos.printarColecaoAlimentos();
                            break;

                            case 2:
                                listafunc.printColecaoFunc();
                            break;
                        }
                        MenuPrintar();
                        op4 = input.nextLine();
                        opconvertido4 = Integer.parseInt(op4);
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