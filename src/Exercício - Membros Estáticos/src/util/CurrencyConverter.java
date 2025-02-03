package util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double dolarToReal(double dolarPrice, double dollars){
        return (dolarPrice * dollars) * IOF + dolarPrice * dollars;
    }
}