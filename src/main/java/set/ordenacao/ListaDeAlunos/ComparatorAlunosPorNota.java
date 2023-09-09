package main.java.set.ordenacao.ListaDeAlunos;

import java.util.Comparator;

public class ComparatorAlunosPorNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }
}
