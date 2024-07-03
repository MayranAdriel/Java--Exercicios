package dio.mayran.segundaSemana.exercicio2;

public class Item {

    private String nome;
    private int quantidade;
    private double preco;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void diminuirQuantidade(int quantidadeDiminuir) throws NumeroMaiorQueQuantidadeException{
        if (quantidadeDiminuir >= this.quantidade){
            throw new NumeroMaiorQueQuantidadeException();
        }
        this.quantidade -= quantidadeDiminuir;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }
}
