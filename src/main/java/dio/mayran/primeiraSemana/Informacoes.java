package dio.mayran.primeiraSemana;

public enum Informacoes {
    SAO_PAULO ("SP", "São Paulo"),
    PARAIBA ("PB", "Paraiba"),
    CEARA ("CE", "Ceará"),
    ALAGOAS ("AL", "Alagoas")
    ;

    private String sigla;
    private String nome;

    Informacoes(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

}
