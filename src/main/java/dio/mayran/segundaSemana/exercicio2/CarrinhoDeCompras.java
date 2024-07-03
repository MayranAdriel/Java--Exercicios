package dio.mayran.segundaSemana.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> listaDeItems;

    public CarrinhoDeCompras() {
        this.listaDeItems = new ArrayList<>();
    }

    public void adicionarItem(String novoItem, double preco, int quantidade) {
        listaDeItems.add(new Item(novoItem, preco, quantidade));
    }

    public void removerItem(String nomeDoItem) {
        for (int i = listaDeItems.size(); i > 0; i--) {
            if (listaDeItems.get(i - 1).getNome().equals(nomeDoItem))
                listaDeItems.remove(i - 1);
        }
    }

    public void removerItem(String nomeDoItem, int quantidadeARemover){
        for (int i = listaDeItems.size(); i > 0; i--) {
            if (listaDeItems.get(i - 1).getNome().equals(nomeDoItem)) {
                try {
                    listaDeItems.get(i - 1).diminuirQuantidade(quantidadeARemover);
                } catch (NumeroMaiorQueQuantidadeException e) {
                    System.out.println("Numero maior que o numero do item");
                }
            }
        }
    }

    public double calcularValorTotalDoCarrinho() {
        double valorTotal = 0;

        for (Item itemAtual : listaDeItems) {
            if (itemAtual.getQuantidade() > 1)
                valorTotal += itemAtual.getPreco() * itemAtual.getQuantidade();
            else {
                valorTotal += itemAtual.getPreco();
            }
        }
        return valorTotal;
    }

    public void exibirItems(){
        for (Item itemAtual : listaDeItems){
            System.out.printf("Nome : %s. \nPreço: %.2f. \nQuantidade: %d. \n\n", itemAtual.getNome(), itemAtual.getPreco(), itemAtual.getQuantidade());
        }
    }
}
