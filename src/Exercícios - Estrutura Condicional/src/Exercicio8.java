import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) throws Exception {
        // Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro:");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("Seu número é par!!");
        } else{
            System.out.println("Seu número é ímpar!!");
        }

        sc.close();
    }
}
