package main.java.list.ordenacao.ordenacaoDePessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoas() {
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        this.listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasOrdenadasPorIdade = new ArrayList<>(this.listaPessoas);
        Collections.sort(pessoasOrdenadasPorIdade);
        return pessoasOrdenadasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasOrdenadasPorAltura = new ArrayList<>(this.listaPessoas);
        Collections.sort(pessoasOrdenadasPorAltura, new ComparatorPessoasPorAltura());
        return pessoasOrdenadasPorAltura;
    }
}
