package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio33 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Quantos números gerão digitados?
        System.out.print("Quantos pessoas voce vai digitar?");
        int n = sc.nextInt();

        // Arrays
        String[] nomes = new String[n];
        int[] idades = new int[n];

        // Loop dos Dados das pessoas;
        for (int i = 0; i < n; i++) {
            System.out.println("Dados da pessoa: ");

            System.out.print("Nome: ");
            nomes[i] = sc.next();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        // Variáveis;
        int max = idades[0];
        int posicaoMaior = 0;

        // Verificando maior e pegando nome;
        for (int i = 1; i < n; i++) {
            if (idades[i] > max) {
                max = idades[i];
                posicaoMaior = i;
            }
        }

        // Printando resposta *Lembrando que %s significa uma String;
        System.out.printf("PESSOA MAIS VELHA: %s;\n", nomes[posicaoMaior]);

        sc.close();

    }

}
