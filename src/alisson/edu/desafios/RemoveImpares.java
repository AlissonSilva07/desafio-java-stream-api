package alisson.edu.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class RemoveImpares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> numerosPares = n -> n % 2 == 0;

        numeros.stream().filter(numerosPares).forEach(System.out::println);
    }
}
