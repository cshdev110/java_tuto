package csh.dev;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author cshdev110
 * @version 1.0
 */
public final class App {
    public static void main(String[] args) {
        try {
            Pattern patt = Pattern.compile("\\s+");

            // (?!')\\p{P} : To remove all punctuation except apostrophes
            // \\s+: And split the line into words
            Map<String, Long> wordCount = Files.lines(Path.of("jse21_functional_programming_stream_text/src/main/java/csh/resources", "words.txt").toAbsolutePath())
                                                .map(line -> line.replaceAll("(?!')\\p{P}", ""))
                                                .flatMap(line -> patt.splitAsStream(line))
                                                .peek(line -> System.out.println(line))
                                                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
            System.out.println();
            wordCount.entrySet()
                        .stream()
                        .peek(entry -> System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue()))
                        .collect(Collectors.groupingBy(entry -> entry.getKey().charAt(0), TreeMap::new, Collectors.toList()))
                        .forEach((letter, wordList) -> {
                            System.out.printf("%n%C%n", letter);
                            wordList.stream()
                                    .forEach(word -> System.out.printf("%13s: %d%n", word.getKey(), word.getValue()));
                        });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
