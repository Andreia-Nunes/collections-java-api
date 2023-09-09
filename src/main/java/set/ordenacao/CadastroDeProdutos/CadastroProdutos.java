package main.java.set.ordenacao.CadastroDeProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade){
        this.produtos.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(this.produtos);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorProdutosPorPreco());
        produtosPorPreco.addAll(this.produtos);
        return produtosPorPreco;
    }
}
