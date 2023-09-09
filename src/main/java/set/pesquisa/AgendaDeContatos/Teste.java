package main.java.set.pesquisa.AgendaDeContatos;

public class Teste {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.exibirContatos();

        agenda.adicionarContato("Andréia", 11111111);
        agenda.adicionarContato("Andréia Nunes", 22222222);
        agenda.adicionarContato("Andréia Nunes Pereira", 33333333);
        agenda.adicionarContato("Maria Silva", 55555555);

        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("Andréia"));

        System.out.println("Contato atualizado: " + agenda.atualizarNumeroContato("Maria Silva", 6666666));

        agenda.exibirContatos();
    }
}
