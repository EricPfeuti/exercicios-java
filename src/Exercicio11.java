import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) throws Exception {
        // Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

        Scanner sc = new Scanner(System.in);

        int codigo1 = sc.nextInt();
        int quantidade = sc.nextInt(); 

        double total;

        if (codigo1 == 1){
            total = 4.0 * quantidade;
        }
        else if(codigo1 == 2){
            total = 4.5 * quantidade;
        }
        else if(codigo1 == 3){
            total = 5.0 * quantidade;
        }
        else if(codigo1 == 4){
            total = 2.0 * quantidade;
        }
        else {
            total = 1.5 * quantidade;
        }

        System.out.printf("Total: R$%.2f;", total);

        sc.close();

    }
}
