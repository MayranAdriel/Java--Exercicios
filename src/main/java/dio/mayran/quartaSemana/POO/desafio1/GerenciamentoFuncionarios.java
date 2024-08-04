package dio.mayran.quartaSemana.POO.desafio1;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class GerenciamentoFuncionarios {
    public static void main(String[] args) {
        Set<Funcionario> setFuncionarios = new HashSet<>();

        FuncionarioAssalariado f1 = new FuncionarioAssalariado("nome 1", 123, 1000.0);
        FuncionarioHorista f2 = new FuncionarioHorista("nome 2", 1234, 4, 100);

        setFuncionarios.add(f1);
        setFuncionarios.add(f2);

        setFuncionarios.forEach(new Consumer<Funcionario>() {
            @Override
            public void accept(Funcionario funcionario) {
                funcionario.calcularPagamento();
            }
        });
    }
}
