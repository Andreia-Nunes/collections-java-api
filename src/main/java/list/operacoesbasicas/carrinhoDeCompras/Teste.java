package main.java.list.operacoesbasicas.carrinhoDeCompras;

public class Teste {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Item 1", 10.00, 1);
        carrinho.adicionarItem("Item 2", 20.00, 2);
        carrinho.adicionarItem("Item 3", 30.00, 3);
        carrinho.adicionarItem("Item 4", 40.00, 4);

        carrinho.exibirItens();
        System.out.printf("O valor total do carrinho é: R$ %.2f\n", carrinho.calcularValorTotal());

        carrinho.removerItem("Item 4");

        carrinho.exibirItens();
        System.out.printf("O valor total do carrinho é: R$ %.2f\n", carrinho.calcularValorTotal());

    }
}
