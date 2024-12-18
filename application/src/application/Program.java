package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {

        // Criação de uma lista de inteiros
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        // Stream<Integer> st1 = list.stream() [cria um stream a partir da lista, sem aplicar nenhuma transformação];
        // Resultado: [3, 4, 5, 10, 7]

        // Criação de um Stream a partir da lista, multiplicando cada elemento por 10
        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));
        // Resultado: [30, 40, 50, 100, 70]

        // Criação de um Stream de strings diretamente
        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));
        // Resultado: [Maria, Alex, Bob]

        // Criação de um Stream infinito que itera a partir de 0, incrementando de 2
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));
        // Resultado: [0, 2, 4, 6, 8, 10, 12, 14, 16, 18]

        // Criação de um Stream infinito para gerar a sequência de Fibonacci
        Stream<Long> st4 = Stream.iterate(new long[]{0L, 1L}, p -> new long[]{p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));
        // Resultado: [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
    }
}