import java.util.Scanner;

public class ExemploSomaImpar {
    public static void main(String[] args) {
        // Leia dois valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.

        Scanner sc = new Scanner(System.in);

        // Lendo Variáveis;
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        // Variáveis podem não estar ordenadas;
        int min, max;
        if(X < Y){
            min = X;
            max = Y;
        } else {
            min = Y;
            max = X;
        }

        int soma = 0; // Elemento neutro da soma;

        // +1, pois mínimo não entra na soma;
        // apenas <, pois máximo não entra também;
        // caso entrassem, ficaria <=;
        for (int i = min + 1; i < max; i++){
            if(i % 2 != 0){
                soma += i;
            }
        }

        System.out.println(soma + ";");

        sc.close();

    }
}
