package Lista01_ListaEncadeada;

public class main {

    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        for (int i = 0; i < 10; i++) {
            // vetor.adicionar(i);
            // System.out.println(i);
        }

        lista.remover(2);

        System.out.println(lista);
    }

}