package main.java.set.pesquisa.ListaDeTarefas;

public class Teste {
    public static void main(String[] args) {
        ListaTarefas tarefas = new ListaTarefas();

        tarefas.adicionarTarefa("Varrer a casa");
        tarefas.adicionarTarefa("Limpar os móveis");
        tarefas.adicionarTarefa("Passar pano no chão");
        tarefas.adicionarTarefa("Lavar o banheiro");
        tarefas.adicionarTarefa("Lavar a louça");
        tarefas.adicionarTarefa("Guardar a louça");
        tarefas.adicionarTarefa("Lavar as roupas");
        tarefas.adicionarTarefa("Estender as roupas");
        tarefas.exibirTarefas();

        tarefas.marcarTarefaConcluida("Varrer a casa");
        tarefas.marcarTarefaConcluida("Passar pano no chão");
        tarefas.marcarTarefaConcluida("Lavar o banheiro");
        tarefas.exibirTarefas();

        tarefas.marcarTarefaPendente("Lavar o banheiro");

        System.out.println("Tarefas concluídas: " + tarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + tarefas.obterTarefasPendentes());

        tarefas.removerTarefa("Lavar o banheiro");
        tarefas.exibirTarefas();

        tarefas.limparListaTarefas();
        tarefas.exibirTarefas();
    }
}
