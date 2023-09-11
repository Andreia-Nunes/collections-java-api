package main.java.map.operacoesbasicas.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        this.dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        this.dicionario.remove(palavra);
    }

    public void exibirPalavras(){
        System.out.println(this.dicionario);
    }

    public String pesquisarPorPalavra(String palavra){
        return this.dicionario.get(palavra);
    }
}
