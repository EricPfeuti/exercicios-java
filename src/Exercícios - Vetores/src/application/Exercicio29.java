package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        
        int qntdPares = 0;

        for (int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS PARES:");

        for (int i = 0; i < n; i++){
            if(vect[i]%2 == 0){
                System.out.printf("%d\n", vect[i]);
                qntdPares++;
            }
        }

        System.out.println("QUANTIDADE de PARES: " + qntdPares + ";");

        sc.close();
    }
}
