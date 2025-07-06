package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Rent;

public class Exercicio35 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];
        // Não existem objetos e todos estão nulos

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();

            System.out.println("Rent #" + (i + 1));
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int room = sc.nextInt();

            vect[room] = new Rent(name, email);
            // Instaciando um objeto e atribuindo a referência dele para o vetor na posição do room, informada pelo usuário
        }

        System.out.println();
        System.out.println("Busy rooms:");

        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) { // apenas imprimir quando o vetor na posição for diferente de nulo/vazio
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}
