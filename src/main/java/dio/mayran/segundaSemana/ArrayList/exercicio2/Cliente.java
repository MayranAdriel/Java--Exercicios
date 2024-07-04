package dio.mayran.segundaSemana.ArrayList.exercicio2;

public class Cliente {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Cenoura", 1.25, 5);
        carrinhoDeCompras.adicionarItem("Batata", 0.75, 10);
        carrinhoDeCompras.adicionarItem("Shampoo", 10, 2);


        carrinhoDeCompras.exibirItems();

        System.out.println(carrinhoDeCompras.calcularValorTotalDoCarrinho());

        carrinhoDeCompras.removerItem("Shampoo", 1);

        carrinhoDeCompras.exibirItems();

        System.out.println(carrinhoDeCompras.calcularValorTotalDoCarrinho());
    }
}
