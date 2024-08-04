package dio.mayran.quartaSemana.POO.desafio2;

import java.util.Calendar;
import java.util.Date;

public class Emprestimo {
    private Livro livro;
    private Membro membro;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public Emprestimo(Livro livro, Membro membro, Date dataEmprestimo, Date dataDevolucao) {
        this.livro = livro;
        this.membro = membro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Membro getMembro() {
        return membro;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "livro=" + livro +
                ", membro=" + membro +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                '}';
    }
}
