package main.java.set.pesquisa.ListaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        this.tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;

        for(Tarefa t : this.tarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover = t;
                break;
            }
        }

        this.tarefas.remove(tarefaParaRemover);
    }

    public void exibirTarefas(){
        System.out.println(this.tarefas);
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for(Tarefa t : this.tarefas){
            if(t.isConcluida()){
                tarefasConcluidas.add(t);
            }
        }

        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for(Tarefa t : this.tarefas){
            if(!t.isConcluida()){
                tarefasPendentes.add(t);
            }
        }

        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for(Tarefa t : this.tarefas){
              if(t.getDescricao().equalsIgnoreCase(descricao)){
                  t.setConcluida(true);
                  break;
              }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for(Tarefa t : this.tarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(false);
                break;
            }
        }
    }

    public void limparListaTarefas(){
        this.tarefas.clear();
    }
}
