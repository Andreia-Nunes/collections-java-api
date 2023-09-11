package main.java.map.pesquisa.contagemDePalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        this.palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        this.palavras.remove(palavra);
    }

    public void exibirContagemPalavras(){
        System.out.println(this.palavras);
    }

    public void encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        Integer quantidade = Integer.MIN_VALUE;

        for(String s : this.palavras.keySet()){
            if(this.palavras.get(s) > quantidade){
                palavraMaisFrequente = s;
                quantidade = this.palavras.get(s);
            }
        }

        System.out.printf("A palavra mais frequente é: %s, que aparece %d vezes no texto.\n", palavraMaisFrequente, quantidade);
    }
}
