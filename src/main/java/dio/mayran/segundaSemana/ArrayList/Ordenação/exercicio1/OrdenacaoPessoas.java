package dio.mayran.segundaSemana.ArrayList.Ordenação.exercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listaDePessoas;

    public OrdenacaoPessoas() {
        this.listaDePessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listaDePessoas.add(new Pessoa(nome, idade, altura));
    }

    public void imprimirLista() {
        System.out.println(listaDePessoas);
    }

    public void ordernarPessoasPorIdade() {
        Collections.sort(listaDePessoas);
    }

    public void ordernarPessoasPorAltura() {
        listaDePessoas.sort(new ComparaPessoaPorAltura());
    }
}
