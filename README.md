# Demo - Criação e Manipulação de Streams na API de Streams do Java

## Objetivo
Este código é um exemplo de como criar e manipular streams em Java, utilizando a API de Streams introduzida no Java 8.
As streams permitem operações funcionais em coleções de dados de forma concisa e legível.

## Estrutura do Código
O código é escrito na linguagem Java e está contido na classe `Program` dentro do pacote `application`.

### Detalhes do Código

1. **Imports Necessários**:
   - `java.util.Arrays`: Usado para manipulação de arrays.
   - `java.util.List`: Interface que representa uma lista.
   - `java.util.stream.Stream`: Classe que representa uma sequência de elementos.

2. **Criação da Lista**:
   - `List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);`
   - Uma lista de inteiros é criada usando o método `asList()` da classe `Arrays`.

3. **Stream a partir da Lista**:
   - `Stream<Integer> st1 = list.stream().map(x -> x * 10);`
   - Um stream é criado a partir da lista, e cada elemento é multiplicado por 10 usando o método `map()`.
   - O resultado é impresso como um array.

4. **Stream de Strings**:
   - `Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");`
   - Um stream de strings é criado diretamente.

5. **Stream Infinito de Inteiros**:
   - `Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);`
   - Um stream é gerado a partir de um valor inicial (0) e cada valor subsequente é incrementado em 2.
   - Os primeiros 10 elementos são limitados e impressos.

6. **Stream Infinito da Sequência de Fibonacci**:
   - `Stream<Long> st4 = Stream.iterate(new long[]{ 0L, 1L }, p -> new long[]{ p[1], p[0] + p[1] }).map(p -> p[0]);`
   - Um stream é gerado para a sequência de Fibonacci, começando com 0 e 1.
   - Os primeiros 10 elementos da sequência são limitados e impressos.

## Resultados Esperados
Ao executar o código, você verá as seguintes saídas no console:

```
[30, 40, 50, 100, 70]
[Maria, Alex, Bob]
[0, 2, 4, 6, 8, 10, 12, 14, 16, 18]
[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
```

- `[30, 40, 50, 100, 70]`: Resultados da multiplicação de cada elemento da lista original por 10.
- `[Maria, Alex, Bob]`: Elementos do stream de strings.
- `[0, 2, 4, 6, 8, 10, 12, 14, 16, 18]`: Primeiros 10 números gerados a partir do stream infinito de inteiros.
- `[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]`: Primeiros 10 números da sequência de Fibonacci.

## Conclusão
Este exemplo ilustra como usar a API de Streams do Java para transformar e manipular dados de forma eficiente e legível.
As streams oferecem uma abordagem funcional à programação, permitindo operações como mapeamento, filtragem e redução em coleções de dados.
Além disso, a capacidade de encadear operações facilita a escrita de código mais limpo e conciso.