package csh.dev;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cshdev110
 * @version 1.0
 */
public final class App {
    public static void main(String[] args) {
        
        Integer[] numbers = {2, 9, 5, 0, 3, 7, 1, 4, 8 ,6};

        // Original numbers
        System.out.printf("%nOriginal numbers: %s%n", Arrays.asList(numbers));

        // Ordered numbers (ascending)
        System.out.printf("%nSorted numbers: %s%n", Arrays.stream(numbers)
                                                            .sorted()
                                                            .collect(Collectors.toList()));

        // Ordering using forEachOrdered 
        System.out.println("\nOrdered numbers using forEachOrdered:");
        Arrays.stream(numbers)
                .sorted()
                .forEachOrdered(number -> System.out.printf("%d ", number));       
        System.out.println();

        // Filtering number greater than 4 and ordering descending
        List<Integer> numbergt4 = Arrays.stream(numbers)
                                        .filter(number -> number > 4)
                                        .sorted(Comparator.reverseOrder())
                                        .collect(Collectors.toList());
        System.out.printf("%nNumbers greater than 4: %s%n", numbergt4);

        System.out.printf("%nNumbers greater than 4 (ascending): %s%n", numbergt4.stream()
                                                                                .sorted()
                                                                                .collect(Collectors.toList())); 

        // Filtering number greater than 4 using version 2
        System.out.printf("%nNumbers greater than 4. Ver.2: %s%n", Arrays.stream(numbers)
                                                                        .filter(number -> number > 4)
                                                                        .collect(Collectors.toList()));
    }
}
