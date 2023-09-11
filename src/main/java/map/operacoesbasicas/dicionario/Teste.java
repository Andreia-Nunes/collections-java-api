package main.java.map.operacoesbasicas.dicionario;

public class Teste {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("amor", "forte afeição por outra pessoa, nascida de laços de consanguinidade ou de relações sociais.");
        dicionario.adicionarPalavra("amizade", "entimento de grande afeição, simpatia, apreço entre pessoas ou entidades.");
        dicionario.adicionarPalavra("felicidade", "qualidade ou estado de feliz");
        dicionario.adicionarPalavra("felicidade", "estado de uma consciência plenamente satisfeita");
        dicionario.adicionarPalavra("tristeza", "estado afetivo caracterizado pela falta de alegria, pela melancolia");
        dicionario.adicionarPalavra("felicidade", "satisfação, contentamento, bem-estar");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("tristeza");

        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("felicidade"));

    }
}
