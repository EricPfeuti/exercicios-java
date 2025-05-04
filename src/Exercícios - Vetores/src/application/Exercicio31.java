package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();
        int[] vect = new int[n];

        int soma = 0;

        for (int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            System.out.printf("VALORES: %d\n", vect[i]);
        }

        for(int i = 0; i < n; i++){
            soma += vect[i];
        }

        System.out.println("SOMA: " + soma + ";");

        int avg = soma / n;

        System.out.println("MEDIA: " + avg + ";");

        sc.close();
    }
}
