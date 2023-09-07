package main.java.list.ordenacao.ordenacaoDePessoas;

public class Teste {
    public static void main(String[] args) {

        OrdenacaoPessoas pessoas = new OrdenacaoPessoas();

        pessoas.adicionarPessoa("Pessoa 1", 20, 1.56);
        pessoas.adicionarPessoa("Pessoa 2", 30, 1.80);
        pessoas.adicionarPessoa("Pessoa 3", 25, 1.70);
        pessoas.adicionarPessoa("Pessoa 4", 17, 1.56);

        System.out.println(pessoas.ordenarPorIdade());
        System.out.println(pessoas.ordenarPorAltura());
    }
}
