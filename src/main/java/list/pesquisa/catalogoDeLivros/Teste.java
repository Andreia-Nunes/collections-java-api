package main.java.list.pesquisa.catalogoDeLivros;

public class Teste {
    public static void main(String[] args) {
        CatalogoLivros meusLivros = new CatalogoLivros();

        meusLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        meusLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        meusLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        meusLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        meusLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(meusLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(meusLivros.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println(meusLivros.pesquisarPorTitulo("Livro 1"));
    }
}
