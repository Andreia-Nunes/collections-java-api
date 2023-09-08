package main.java.set.operacoesbasicas.conjuntoDeConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoDeConvidados {

    private Set<Convidado> conjuntoDeConvidados;

    public ConjuntoDeConvidados() {
        this.conjuntoDeConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        this.conjuntoDeConvidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;

        for(Convidado c : this.conjuntoDeConvidados){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }

        this.conjuntoDeConvidados.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return this.conjuntoDeConvidados.size();
    }

    public void exibirConvidados(){
        System.out.println(this.conjuntoDeConvidados);
    }
}
