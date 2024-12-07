import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        // Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos. 
        // Área = π . raio2 
        // π = 3.14159

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        
        double area = 3.14159 * Math.pow(raio, 2.0);

        System.out.printf("Área = %.4f%n", area);

        sc.close();
    }
}
