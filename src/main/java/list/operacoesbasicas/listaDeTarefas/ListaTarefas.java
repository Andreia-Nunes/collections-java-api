package main.java.list.operacoesbasicas.listaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        this.listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        if(!this.listaTarefas.isEmpty()){
            for(Tarefa t : this.listaTarefas){
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasParaRemover.add(t);
                }
            }
        }

        this.listaTarefas.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return this.listaTarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(this.listaTarefas);
    }
}
