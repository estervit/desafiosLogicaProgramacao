import java.util.Locale;
import java.util.Scanner;

public class impostoDeRenda {
    public static void main(String[] args) {
        final double  MENOR_IMPOSTO = 0.08;
        final double  INTEMEDIARIO = 0.18;
        final double  MAIOR_IMPOSTO = 0.28;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

        double imposto;
        if (salario <= 2000.0) {
            imposto = 0.0;
        }
        else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * MENOR_IMPOSTO;
        }
        else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * INTEMEDIARIO + 1000.0 * MENOR_IMPOSTO;
        }
        else {
            imposto = (salario - 4500.0) * MAIOR_IMPOSTO + 1500.0 * INTEMEDIARIO + 1000.0 * MENOR_IMPOSTO;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();
    }

}
