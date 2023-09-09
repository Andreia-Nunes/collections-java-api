package main.java.map.ContagemDePalavras;

public class Teste {
    public static void main(String[] args) {
        ContagemPalavras palavras = new ContagemPalavras();

        palavras.adicionarPalavra("amor", 5);
        palavras.adicionarPalavra("amizade", 3);
        palavras.adicionarPalavra("esperança", 8);
        palavras.adicionarPalavra("felicidade", 10);
        palavras.adicionarPalavra("tristeza", 0);

        palavras.exibirContagemPalavras();
        palavras.encontrarPalavraMaisFrequente();

        palavras.removerPalavra("tristeza");
        palavras.exibirContagemPalavras();
    }
}
