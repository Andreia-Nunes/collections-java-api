package main.java.list.operacoesbasicas.listaDeTarefas;

public class Teste {
    public static void main(String[] args) {
        ListaTarefas minhasTarefas = new ListaTarefas();

        System.out.printf("A quantidade de tarefas na minha lista é: %d\n", minhasTarefas.obterNumeroTotalTarefas());

        minhasTarefas.adicionarTarefa("Tarefa 1");
        minhasTarefas.adicionarTarefa("Tarefa 1");
        minhasTarefas.adicionarTarefa("Tarefa 2");
        minhasTarefas.adicionarTarefa("Tarefa 3");
        System.out.printf("A quantidade de tarefas na minha lista é: %d\n", minhasTarefas.obterNumeroTotalTarefas());

        minhasTarefas.obterDescricoesTarefas();

        minhasTarefas.removerTarefa("Tarefa 1");
        System.out.printf("A quantidade de tarefas na minha lista é: %d\n", minhasTarefas.obterNumeroTotalTarefas());

        minhasTarefas.obterDescricoesTarefas();
    }
}
