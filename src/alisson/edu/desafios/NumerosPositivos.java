package alisson.edu.desafios;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NumerosPositivos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Consumer<Integer> numerosPositivos = n -> {
            if (n >= 0) {
                System.out.println("Todos os númros são positivos.");
            }
        };

        numeros.forEach(numerosPositivos);
    }
}
