import java.util.ArrayList;

public class ColecaoNotaFiscal implements ContratoNotaFiscal {
    ArrayList<NotaFiscal> listaNotas = new ArrayList<NotaFiscal>();

    public void criarNotaFiscal(NotaFiscal n){
        listaNotas.add(n);
    }

    public void removerNotaFiscal(NotaFiscal n) {
        listaNotas.remove(n);
    }

    public void printarColecaoNotaFiscal() {
        int i;
        System.out.println("\n\n-- Lista de Notas --");
        int n = listaNotas.size();
        for (i=0; i<n; i++){
            System.out.printf("\n      #NF %d#\n%s", i+1, listaNotas.get(i));
        }
    }
}
