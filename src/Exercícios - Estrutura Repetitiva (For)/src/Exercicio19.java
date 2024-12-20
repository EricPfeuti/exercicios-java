import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) throws Exception {
        // Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo)
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int valoresIn = 0;
        int valoresOut = 0;
        for (int i = 0; i < N; i++){
            int x = sc.nextInt();
            if(x >= 10 && x <= 20){
                valoresIn += 1;
            } else{
                valoresOut += 1;
            }
        }

        System.out.println(valoresIn + " In;");
        System.out.println(valoresOut + " Out;");

        sc.close();

    }
}
