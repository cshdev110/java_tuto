package csh.dev;

import java.security.SecureRandom;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @auther cshdev110
 * @version 1.0
 */
public final class App {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        // Execute 10000 times selecting a number from 1 to 8, and then
        // grouping the numbers by their identity and counting the frequency
        System.out.printf("%-6s%s%n", "Face", "Frequency");
        random.ints(10000, 1, 9)
                .boxed()
                // .peek(System.out::println)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((face, frecuency) -> System.out.printf("%-6d%d%n", face, frecuency));
    }
}
