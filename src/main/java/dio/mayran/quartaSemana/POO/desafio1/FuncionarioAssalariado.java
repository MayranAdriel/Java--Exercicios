package dio.mayran.quartaSemana.POO.desafio1;

public class FuncionarioAssalariado extends Funcionario{

    private double salarioMensal;

    public FuncionarioAssalariado(String nome, long id, double salarioMensal) {
        super(nome, id);
        this.salarioMensal = salarioMensal;
    }

    @Override
    void calcularPagamento() {
        System.out.printf("%.2f por mês.%n", salarioMensal);
    }
}
