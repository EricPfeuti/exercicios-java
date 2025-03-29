package application;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < n; i++){
            if(n<10){
                System.out.print("Digite um número: ");
                vect[i] = sc.nextInt();
            }
        }
        
        System.out.println("NÚMEROS NEGATIVOS: ");

        for(int i = 0; i < n; i++){
            if(vect[i]<0){
                System.out.printf("%d\n", vect[i]);
                // %d significa que um valor inteiro é esperado nessa posição na string;
            }
        }

        sc.close();
    }
}
