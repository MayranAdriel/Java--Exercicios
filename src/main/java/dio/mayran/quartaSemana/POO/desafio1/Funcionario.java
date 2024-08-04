package dio.mayran.quartaSemana.POO.desafio1;

import java.util.Objects;

public abstract class Funcionario {
    private String nome;
    private long id;

    Funcionario(String nome, long id) {
        this.nome = nome;
        this.id = id;
    }

    String getNome() {
        return nome;
    }

    long getId() {
        return id;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setId(long id) {
        this.id = id;
    }

    abstract void calcularPagamento();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                '}';
    }
}
