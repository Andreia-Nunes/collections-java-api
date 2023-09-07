package main.java.list.operacoesbasicas.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        this.listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();

        if(!this.listaItens.isEmpty()){
            for(Item i : this.listaItens){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(i);
                }
            }
        }

        this.listaItens.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double precoTotal = 0.0;

        if(!this.listaItens.isEmpty()){
            for(Item i : this.listaItens){
                precoTotal += i.getPreco() * i.getQuantidade();
            }
        }

        return precoTotal;
    }

    public void exibirItens(){
        System.out.println(this.listaItens);
    }
}
