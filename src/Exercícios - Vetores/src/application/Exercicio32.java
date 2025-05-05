package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Quantos números gerão digitados?
        System.out.print("Quantos pessoas serão digitadas?");
        int n = sc.nextInt();

        // Arrays
        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        // Variáveis de soma para média e menores;
        double soma = 0.0;
        int menores = 0;

        // Loop dos Dados das pessoas;
        for (int i = 0; i < n; i++){
            System.out.println("Dados da pessoa: ");

            System.out.print("Nome: ");
            nomes[i] = sc.next();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();

            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        // Loop da soma para média;
        for (int i = 0; i < n; i++){
            soma += alturas[i];
        }

        // Cálculo da média;
        double avg = soma / n;
        
        // Verificando quantos menores tem;
        for (int i = 0; i < n; i++){
            if(idades[i] < 16){
                menores++;
            }
        }

        // Calculando porcentagem de menores;
        double porcentagem = ((double)menores / n) * 100.0;

        System.out.println();

        // Resultados
        System.out.printf("Altura média: %.2f%n", avg);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagem);

        // Pegando os nomes dos menores;
        for (int i = 0; i < n; i++){
            if(idades[i] < 16){
                System.out.printf("%s\n", nomes[i]);
                // %s significa uma string;
            }
        }

        sc.close();
    }
}