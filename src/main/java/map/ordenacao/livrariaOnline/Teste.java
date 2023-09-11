package main.java.map.ordenacao.livrariaOnline;

public class Teste {
    public static void main(String[] args) {
        LivrariaOnline livraria = new LivrariaOnline();

        livraria.adicionarLivro("https://www.amazon.com.br/C%C3%B3digo-limpo-Robert-C-Martin/dp/8576082675/ref=sr_1_1?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&keywords=livros+de+programa%C3%A7%C3%A3o&sr=8-1", "Código limpo: Habilidades práticas do Agile Software", "Robert C. Martin", 86.99);
        livraria.adicionarLivro("https://www.amazon.com.br/Entendendo-Algoritmos-Ilustrado-Programadores-Curiosos/dp/8575225634/ref=sr_1_2?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&keywords=livros+de+programa%C3%A7%C3%A3o&sr=8-2", "Entendendo Algoritmos: Um Guia Ilustrado Para Programadores e Outros Curiosos", "Aditya Y. Bhargava", 68.49);
        livraria.adicionarLivro("https://www.amazon.com.br/codificador-limpo-conduta-programadores-profissionais/dp/8576086476/ref=sr_1_8?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&keywords=livros+de+programa%C3%A7%C3%A3o&sr=8-8", "O codificador limpo: Um código de conduta para programadores profissionais", "Bob Martin", 73.63);
        livraria.adicionarLivro("https://www.amazon.com.br/Arquitetura-Limpa-Artes%C3%A3o-Estrutura-Software/dp/8550804606/ref=d_pd_sbs_sccl_3_2/139-6431370-8097419?content-id=amzn1.sym.bc536bd6-e72b-44eb-9471-0bedf0517c03&pd_rd_i=8550804606&psc=1", "Arquitetura limpa: O guia do artesão para estrutura e design de software", "Robert C. Martin", 67.29);

        livraria.pesquisarLivrosPorAutor("Robert C. Martin").stream().forEach((Livro l) -> System.out.println(l));

        livraria.exibirLivrosOrdenadosPorPreco();

        System.out.printf("O livro mais caro é: %s\n", livraria.obterLivroMaisCaro());
        System.out.printf("O livro mais barato é: %s\n", livraria.obterLivroMaisBarato());

        livraria.removerLivro("Entendendo Algoritmos: Um Guia Ilustrado Para Programadores e Outros Curiosos");

        livraria.exibirLivrosOrdenadosPorPreco();




    }
}
