import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) throws Exception {
        // Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial de 0 é 1.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fatorial = 1;

        if(n == 1){
            System.out.println(n + "! = " + 1 + ";");
        } else if(n == 0){
            System.out.println(n + "! = " + 1 + ";");
        }

        for(int i = 1; i <= n; i++){
            fatorial = fatorial * i;
        }

        System.out.println(n + "! = " + fatorial + ";");

        sc.close();

    }
}
