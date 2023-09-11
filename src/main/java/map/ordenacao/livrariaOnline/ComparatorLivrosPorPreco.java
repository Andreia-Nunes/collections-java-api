package main.java.map.ordenacao.livrariaOnline;

import java.util.Comparator;

public class ComparatorLivrosPorPreco implements Comparator<Livro> {
    @Override
    public int compare(Livro l1, Livro l2) {
        return Double.compare(l1.getPreco(), l2.getPreco());
    }
}
