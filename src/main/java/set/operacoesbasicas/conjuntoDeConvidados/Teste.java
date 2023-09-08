package main.java.set.operacoesbasicas.conjuntoDeConvidados;

public class Teste {
    public static void main(String[] args) {
        ConjuntoDeConvidados convidados = new ConjuntoDeConvidados();

        System.out.printf("O conjunto de convidados possui %d elemento(s)\n", convidados.contarConvidados());

        convidados.adicionarConvidado("Convidado 1", 1234);
        convidados.adicionarConvidado("Convidado 2", 1235);
        convidados.adicionarConvidado("Convidado 3", 1235);
        convidados.adicionarConvidado("Convidado 4", 1236);

        System.out.printf("O conjunto de convidados possui %d elemento(s)\n", convidados.contarConvidados());
        convidados.exibirConvidados();

        convidados.removerConvidadoPorCodigoConvite(1235);

        System.out.printf("O conjunto de convidados possui %d elemento(s)\n", convidados.contarConvidados());
        convidados.exibirConvidados();
    }
}
