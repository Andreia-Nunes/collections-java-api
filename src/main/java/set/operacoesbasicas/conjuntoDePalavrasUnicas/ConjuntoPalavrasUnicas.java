package main.java.set.operacoesbasicas.conjuntoDePalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> conjuntoPalavras;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        this.conjuntoPalavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        this.conjuntoPalavras.remove(palavra);
    }

    public boolean verificarPalavra(String palavra){
        return this.conjuntoPalavras.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(this.conjuntoPalavras);
    }
}
