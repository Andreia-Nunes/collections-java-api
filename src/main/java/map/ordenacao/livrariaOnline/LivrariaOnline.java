package main.java.map.ordenacao.livrariaOnline;

import java.util.*;

public class LivrariaOnline {

    private Map<String, Livro> livros;

    public LivrariaOnline() {
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        this.livros.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        String keyLivroParaRemover = null;

        for(Map.Entry<String, Livro> entry : this.livros.entrySet()){
            if(entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                keyLivroParaRemover = entry.getKey();
                break;
            }
        }

        this.livros.remove(keyLivroParaRemover);
    }

    public void exibirLivrosOrdenadosPorPreco(){
        List<Livro> livrosOrdenadosPorPreco = new ArrayList<>(this.livros.values());
        Collections.sort(livrosOrdenadosPorPreco, new ComparatorLivrosPorPreco());
        System.out.println(livrosOrdenadosPorPreco);
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();

        for(Map.Entry<String, Livro> entry : this.livros.entrySet()){
            if(entry.getValue().getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.add(entry.getValue());
            }
        }

        return livrosPorAutor;
    }

    public Livro obterLivroMaisCaro(){
        Double precoMaisCaro = Double.MIN_VALUE;
        Livro livroMaisCaro = null;

        for(Map.Entry<String, Livro> entry : this.livros.entrySet()){
            if(entry.getValue().getPreco() > precoMaisCaro){
                precoMaisCaro = entry.getValue().getPreco();
                livroMaisCaro = entry.getValue();
            }
        }

        return livroMaisCaro;
    }

    public Livro obterLivroMaisBarato(){
        Double precoMaisBarato = Double.MAX_VALUE;
        Livro livroMaisBarato = null;

        for(Map.Entry<String, Livro> entry : this.livros.entrySet()){
            if(entry.getValue().getPreco() < precoMaisBarato){
                precoMaisBarato = entry.getValue().getPreco();
                livroMaisBarato = entry.getValue();
            }
        }

        return livroMaisBarato;
    }
}
