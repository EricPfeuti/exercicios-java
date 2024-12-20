import java.util.Locale;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) throws Exception {
        // Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double nota1, nota2, nota3;
        double media;
        for (int i = 0; i < N; i++){
            nota1 = sc.nextDouble();
            nota2 = sc.nextDouble();
            nota3 = sc.nextDouble();

            media = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 5.0) / 10.0;

            System.out.printf("%.1f%n;", media);
        }

        sc.close();

    }
}
