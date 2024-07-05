package dio.mayran.segundaSemana.ArrayList.Ordenação.exercicio1;

public class Cliente {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Mayran", 18, 1.60);
        ordenacaoPessoas.adicionarPessoa("Mayran", 19, 1.80);
        ordenacaoPessoas.adicionarPessoa("Mayran", 45, 1.40);
        ordenacaoPessoas.adicionarPessoa("Mayran", 17, 1.50);

//        ordenacaoPessoas.ordernarPessoasPorAltura();
//        ordenacaoPessoas.ordernarPessoasPorIdade();


        ordenacaoPessoas.imprimirLista();


    }
}
