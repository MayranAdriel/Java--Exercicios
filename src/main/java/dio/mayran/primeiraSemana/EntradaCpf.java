package dio.mayran.primeiraSemana;

public class EntradaCpf {
    public static void main(String[] args) {
        try {
            formatador("1234578");
        } catch (CpfFormaterException e) {
            System.out.println("O cpf nao corresponde as regras de negocios");
        }


    }

    static String formatador(String cpf) throws CpfFormaterException {
        if (cpf.length() != 8)
            throw new CpfFormaterException();
        return "123-456-789";
    }
}
