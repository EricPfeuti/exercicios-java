package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos voce vai digitar? ");
        int n = sc.nextInt();
        double media;
        double[] notas1 = new double[n];
        double[] notas2 = new double[n];
        String[] nomes = new String[n];

        for(int i = 0; i < n; i++){
            System.out.println("Digite um nome, primeira e segunda nota do aluno: ");
            sc.nextLine();
            nomes[i] = sc.nextLine();
            notas1[i] = sc.nextDouble();
            notas2[i] = sc.nextDouble();
        }

        System.out.println("ALUNOS APROVADOS:");

        for(int i = 0; i < n; i++){
            media = (notas1[i] + notas2[i]) / 2;

	        if(media >= 6.0) {
	            System.out.printf("%s\n", nomes[i]);
                // %s significa uma string
	        }
        }

        sc.close();
    }
}
