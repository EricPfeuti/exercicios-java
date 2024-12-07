import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        // Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int soma = num1 + num2;

        System.out.println("Soma = " + soma + ";");

        sc.close();
    }
}
