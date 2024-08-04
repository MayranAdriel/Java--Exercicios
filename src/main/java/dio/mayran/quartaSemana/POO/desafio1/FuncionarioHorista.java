package dio.mayran.quartaSemana.POO.desafio1;

public class FuncionarioHorista extends Funcionario{

    private double horasTrabalhadas;
    private double valorPorHora;

    public FuncionarioHorista(String nome, long id, double horasTrabalhadas, double valorPorHora) {
        super(nome, id);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    void calcularPagamento() {
        System.out.printf("Salário: %.2f", horasTrabalhadas * valorPorHora);
    }
}
