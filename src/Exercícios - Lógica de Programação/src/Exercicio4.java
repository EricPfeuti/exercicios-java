import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        // Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int horas = sc.nextInt();
        double valorHora = sc.nextDouble();

        double salario = valorHora * horas;

        System.out.println();
        System.out.println("Number = " + number + ";");
        System.out.printf("Salary = U$ %.2f;", salario);

        sc.close();

    }
}
