package csh.dev;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author cshdev110
 * @version 1.0
 */
public final class App {
    public static void main(String[] args) {
        int[] arr = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7, 15, 21, 89, 22};

        // Show all elements
        System.out.println("All elements:");
        IntStream.of(arr).forEach(num -> System.out.printf("%d ", num));
        System.out.println();

        // Count the number of elements
        System.out.printf("Count: %d\n", IntStream.of(arr).count());
        // Get the minimum value
        System.out.printf("Min: %d\n", IntStream.of(arr).min().getAsInt());
        // Get the maximum value
        System.out.printf("Max: %d\n", IntStream.of(arr).max().getAsInt());
        // Get the sum of all elements
        System.out.printf("Sum: %d\n", IntStream.of(arr).sum());
        // Get the average value
        System.out.printf("Average: %.2f\n", IntStream.of(arr).average().orElse(0.0));

        // Transform from a stream of int to a Map including index
        System.out.println("Transform to a Map including index:");
        Map<Integer, Integer> intMap1 = IntStream.range(0, arr.length)
                                                    .boxed()
                                                    // .peek(System.out::println)
                                                    .collect(Collectors.toMap(Function.identity(), i -> arr[i]));
        intMap1.forEach((k, v) -> System.out.printf("%d: %d\n", k, v));      
        
        // Same as above, but use Arrays.stream() instead of IntStream.range()
        System.out.println("Transform to a Map including index:");
        Map<Integer, Integer> intMap2 = Arrays.stream(IntStream.range(0, arr.length).toArray())
                                                .boxed()
                                                // .peek(System.out::println)
                                                .collect(Collectors.toMap(Function.identity(), i -> arr[i]));
        intMap2.forEach((k, v) -> System.out.printf("%d: %d\n", k, v));    
        
        // Filter the Map by value        
        Map<Integer, Integer> intMap3 = intMap2.entrySet().stream()
                                                            .filter(entry -> entry.getValue() % 2 == 0)
                                                            // .peek(System.out::println)
                                                            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        intMap3.entrySet().forEach(System.out::println);                          
        System.out.println();

        // Sum all values using reduce()
        System.out.printf("Sum all values using reduce(): %d\n", IntStream.of(arr).reduce(0, (a, b) -> a + b));
        // Sum the square of all values using reduce()
        System.out.printf("Sum the square of all values using reduce(): %d\n", IntStream.of(arr).reduce(0, (a, b) -> a + b * b));
        // The product of all values using reduce()
        System.out.printf("The product of all values using reduce(): %d\n", IntStream.of(arr).reduce(1, (a, b) -> a * b));
        System.out.println();

        // Ordering by even numbers
        System.out.println("Ordering by even numbers:");
        IntStream.of(arr)
                    .filter(num -> num % 2 == 0)
                    .sorted()
                    .forEach(num -> System.out.printf("%d ", num));
        System.out.println();

        // Ordering by odd numbers
        System.out.println("Ordering by odd numbers:");
        IntStream.of(arr)
                    .filter(num -> num % 2 != 0)
                    .sorted()
                    .forEach(num -> System.out.printf("%d ", num));
        System.out.println();

        // Simple sum of a range of number from 1 to 10
        System.out.printf("Simple sum of a range of number from 1 to 10: %d\n", IntStream.range(1, 11).sum());

        // Same as above, inclusive
        System.out.printf("Same as above, inclusive: %d\n", IntStream.rangeClosed(1, 11).sum());


    }
}
