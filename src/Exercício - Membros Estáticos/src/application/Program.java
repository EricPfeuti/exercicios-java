package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dolarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dollars = sc.nextDouble();

        double dolarValueInReais = CurrencyConverter.dolarToReal(dolarPrice, dollars);

        System.out.printf("Amount to be paid in reais = %.2f;", dolarValueInReais);

        sc.close();
    }
}