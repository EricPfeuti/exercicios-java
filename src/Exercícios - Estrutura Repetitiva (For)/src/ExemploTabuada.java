import java.util.Scanner;

public class ExemploTabuada {
    public static void main(String[] args) {
        // Leia 1 valor inteiro N(2 < N < 1000). A seguir, mostre a tabuada de N:
        // 1xN = N 2xN = 2N... 10xN = 10N.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int N = sc.nextInt();
        System.out.println("TABUADA:");

        for (int i=1; i <= 10; i++){
            int produto = i * N;
            System.out.println(i + " x " + N + " = " + produto + ";");
        }

        sc.close();

    }
}
