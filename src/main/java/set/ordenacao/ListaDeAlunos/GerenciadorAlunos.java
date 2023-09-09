package main.java.set.ordenacao.ListaDeAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double nota){
        this.alunos.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula){
        Aluno alunoParaRemover = null;

        for(Aluno a : this.alunos){
            if(a.getMatricula() == matricula){
                alunoParaRemover = a;
                break;
            }
        }

        this.alunos.remove(alunoParaRemover);
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(this.alunos);
        System.out.println(alunosPorNome);
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorAlunosPorNota());
        alunosPorNota.addAll(this.alunos);
        System.out.println(alunosPorNota);
    }

    public void exibirAlunos(){
        System.out.println(this.alunos);
    }


}
