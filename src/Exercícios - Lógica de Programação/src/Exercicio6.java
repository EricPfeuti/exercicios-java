import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        // Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre: 
        // a) a área do triângulo retângulo que tem A por base e C por altura. -> Área = base . altura 
        // b) a área do círculo de raio C. (pi = 3.14159) -> Área = π . raio2  
        // c) a área do trapézio que tem A e B por bases e C por altura. -> Área = (BASE + base).altura/2
        // d) a área do quadrado que tem lado B. -> Área = b.b
        // e) a área do retângulo que tem lados A e B. -. Área = A.B

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorA = sc.nextDouble();
        double valorB = sc.nextDouble();
        double valorC = sc.nextDouble();

        double questaoA = valorA * valorC / 2.0;
        double questaoB = 3.14159 * (valorC*valorC);
        double questaoC = ((valorA + valorB) * valorC)/ 2.0;
        double questaoD = valorB * valorB;
        double questaoE = valorA * valorB;

        System.out.println();
        System.out.println("VALORES:");
        System.out.printf("Triângulo: %.3f;%n", questaoA);
        System.out.printf("Círculo: %.3f;%n", questaoB);
        System.out.printf("Trapézio: %.3f;%n", questaoC);
        System.out.printf("Quadrado: %.3f;%n", questaoD);
        System.out.printf("Retângulo: %.3f;%n", questaoE);

        sc.close();

    }
}
