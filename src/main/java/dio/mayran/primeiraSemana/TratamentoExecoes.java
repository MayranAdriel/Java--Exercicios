package dio.mayran.primeiraSemana;

import java.util.Locale;
import java.util.Scanner;

public class TratamentoExecoes {
    public static void main(String[] args) {
        boolean inputValido = false;
        while (!inputValido) {
            try {
                Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

                System.out.println("Informe sua idade: ");
                int idade = scanner.nextInt();


                System.out.println("Sua idade é: " + idade);
                inputValido = true;
            } catch (Throwable e) {
                System.out.println("Error" + e);
            }
        }
    }
}
