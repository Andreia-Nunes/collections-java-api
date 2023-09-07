package main.java.list.ordenacao.ordenacaoDeNumeros;

import main.java.list.pesquisa.somaDeNumeros.SomaNumeros;

public class Teste {
    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(3);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);

        System.out.println(numeros.ordenarAscendente());
        System.out.println(numeros.ordenarDescendente());
    }
}
