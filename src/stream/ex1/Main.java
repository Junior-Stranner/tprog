package stream.ex1;

import lambda.ex1.Conversor;

public class Main {
    public static void main(String[] args) {
        // 1 - Converter para maiúsculas
        Conversor maiusculas = String::toUpperCase;

        // 2 - Inverter caracteres
        Conversor inverter = texto -> new StringBuilder(texto).reverse().toString();

        String original1 = "java é top";
        String original2 = "lambda";

        System.out.println("Original: " + original1);
        System.out.println("Maiúsculas: " + maiusculas.converter(original1));
        System.out.println("Invertido: " + inverter.converter(original1));

        System.out.println("\nOriginal: " + original2);
        System.out.println("Maiúsculas: " + maiusculas.converter(original2));
        System.out.println("Invertido: " + inverter.converter(original2));
    }
}
