package main.java.set.ordenacao.ListaDeAlunos;

public class Teste {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Luciana", 123, 8.0);
        gerenciadorAlunos.adicionarAluno("Bruna", 456, 9.0);
        gerenciadorAlunos.adicionarAluno("Andréia", 789, 10.0);

        gerenciadorAlunos.exibirAlunos();
        gerenciadorAlunos.exibirAlunosPorNome();
        gerenciadorAlunos.exibirAlunosPorNota();

        gerenciadorAlunos.removerAluno(123);
        gerenciadorAlunos.exibirAlunos();
    }
}
