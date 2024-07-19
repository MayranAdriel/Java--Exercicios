package dio.mayran.segundaSemana.Map.exercicio3;

public class Cliente {
    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("link 1", "titulo 1", "autor 1", 1.0);
        livrariaOnline.adicionarLivro("link 2", "titulo 2", "autor 2", 5.0);
        livrariaOnline.adicionarLivro("link 3", "titulo 3", "autor 3", 3.0);
        livrariaOnline.adicionarLivro("link 4", "titulo 3", "autor 1 e autor 3", 2.0);

        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());
    }
}
