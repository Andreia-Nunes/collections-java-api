package main.java.set.ordenacao.CadastroDeProdutos;

public class Teste {
    public static void main(String[] args) {
        CadastroProdutos produtos = new CadastroProdutos();

        produtos.adicionarProduto("Produto 5", 1L, 15.00, 5);
        produtos.adicionarProduto("Produto 0", 2L, 20.00, 10);
        produtos.adicionarProduto("Produto 3", 1L, 10.00, 2);
        produtos.adicionarProduto("Produto 9", 9L, 2.00, 2);

        System.out.println(produtos.getProdutos());

        System.out.println(produtos.exibirProdutosPorNome());

        System.out.println(produtos.exibirProdutosPorPreco());
    }
}
