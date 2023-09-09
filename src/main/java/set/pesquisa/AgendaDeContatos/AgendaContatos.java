package main.java.set.pesquisa.AgendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        this.contatos.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(this.contatos);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();

        for(Contato c : this.contatos){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }

        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;

        for(Contato c : this.contatos){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }

        return contatoAtualizado;
    }
}
