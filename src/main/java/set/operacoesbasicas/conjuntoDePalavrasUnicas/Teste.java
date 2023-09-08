package main.java.set.operacoesbasicas.conjuntoDePalavrasUnicas;

public class Teste {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();

        palavras.exibirPalavrasUnicas();

        palavras.adicionarPalavra("Carro");
        palavras.adicionarPalavra("Carro");
        palavras.adicionarPalavra("Casa");
        palavras.adicionarPalavra("Casa");
        palavras.adicionarPalavra("Viagem");

        System.out.printf("A palavra CASA está presente no conjunto? Resposta: %b\n", palavras.verificarPalavra("Casa"));

        palavras.exibirPalavrasUnicas();

        palavras.removerPalavra("Viagem");

        palavras.exibirPalavrasUnicas();
    }
}
