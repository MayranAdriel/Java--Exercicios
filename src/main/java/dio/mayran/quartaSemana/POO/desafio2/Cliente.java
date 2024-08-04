package dio.mayran.quartaSemana.POO.desafio2;


public class Cliente {
    public static void main(String[] args) {
        Livro livro1 = new Livro("titulo1", "autor1", 2020, 123456789);
        Livro livro2= new Livro("titulo2", "autor2" , 2021, 123456782);

        Membro membro1 = new Membro("nome1", 123, "rua1", "4002-8922");
        Membro membro2 = new Membro("nome2", 124, "rua2", "4002-8923");

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.cadastrarMembro(membro1);
        biblioteca.cadastrarMembro(membro2);
        biblioteca.imprimirLivros();
        biblioteca.imprimirMembros();
        biblioteca.imprimirEmprestimos();
        biblioteca.emprestarLivro(livro1, membro1);
        biblioteca.imprimirLivros();
        biblioteca.imprimirMembros();
        biblioteca.devolverLivro(livro1, membro1);
        biblioteca.imprimirLivros();
        biblioteca.imprimirMembros();
    }
}
