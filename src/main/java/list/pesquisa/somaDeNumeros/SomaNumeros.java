package main.java.list.pesquisa.somaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.listaNumeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;

        if(!this.listaNumeros.isEmpty()){
            for(int n : listaNumeros){
                soma += n;
            }
        }

        return soma;
    }

    public int encontrarMaiorNumero(){
        Integer maiorNumero = null;

        if(!this.listaNumeros.isEmpty()){
            maiorNumero = this.listaNumeros.get(0);

            for(int n : this.listaNumeros) {
                if (n > maiorNumero) {
                    maiorNumero = n;
                }
            }
        }

        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        Integer menorNumero = null;

        if(!this.listaNumeros.isEmpty()){
            menorNumero = this.listaNumeros.get(0);

            for(int n : this.listaNumeros) {
                if (n < menorNumero) {
                    menorNumero = n;
                }
            }
        }

        return menorNumero;
    }

    public void exibirNumeros(){
        System.out.println(this.listaNumeros);
    }
}
