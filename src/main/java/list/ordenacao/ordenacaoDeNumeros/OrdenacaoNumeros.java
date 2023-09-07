package main.java.list.ordenacao.ordenacaoDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.listaNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosOrdemAscendente = new ArrayList<>(this.listaNumeros);
        Collections.sort(numerosOrdemAscendente);
        return numerosOrdemAscendente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosOrdemDescendente = new ArrayList<>(this.listaNumeros);
        numerosOrdemDescendente.sort(Collections.reverseOrder());
        return numerosOrdemDescendente;
    }
}
