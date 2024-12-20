import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        // Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoPeca1 = sc.nextInt();
        double numeroPeca1 = sc.nextDouble();
        double valorPeca1 = sc.nextDouble();

        int codigoPeca2 = sc.nextInt();
        double numeroPeca2 = sc.nextDouble();
        double valorPeca2 = sc.nextDouble();

        double total = numeroPeca1 * valorPeca1 + numeroPeca2 * valorPeca2;

        System.out.println();
        System.out.println("Código da peça 1: " + codigoPeca1 + ";\n" + "Código da peça 2: " + codigoPeca2 + ";");
        System.out.printf("Valor a pagar: R$%.2f;", total);

        sc.close();
    }
}
