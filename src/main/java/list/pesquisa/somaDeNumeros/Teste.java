package main.java.list.pesquisa.somaDeNumeros;

public class Teste {
    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(1);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(3);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(5);

        numeros.exibirNumeros();
        System.out.printf("O menor número é: %d\n", numeros.encontrarMenorNumero());
        System.out.printf("O maior número é: %d\n", numeros.encontrarMaiorNumero());

        System.out.printf("A soma dos números é: %d\n", numeros.calcularSoma());
    }
}
