import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) throws Exception {
        // Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("Seu número é positivo!!");
        } else {
            System.out.println("Seu número é negativo!!");
        }

        sc.close();
    }
}
