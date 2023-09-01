package csh.dev;

import java.util.function.Function;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Consumer;

/**
 * JAVA HIGH ORDER FUNCTIONS
 * @author cshdev110
 * @version 1.0
 * 
 */
public final class App {

    // These are two manners to perform similar operations via method reference.
    private Function<String, String> toUpperCase_f = String::toUpperCase;
    private Function<String, String> toLowerCase_f = str -> str.toLowerCase();

    public Function<String, String> auxPrint(String message) {
        return str -> message + str;
    }

    public void testUpperLowerCases(Function<String, String> funct, String str) {
        System.out.println(funct.apply(str));
    }

    // Use of the functional interface Predicate
    public Predicate<String> establishLogic(String chain) {
        return str -> str.toLowerCase().contains(chain.toLowerCase());
    }

    public Predicate<String> establishLogic(int length) {
        return str -> str.toLowerCase().length() <= length;
    }

    public void testPredicates(List<String> list, Consumer<String> consumer, int length, String chain) {
        list.stream()
            .filter((chain != null) ? this.establishLogic(chain) : this.establishLogic(length))
            .forEach(consumer);
    }

    public static void main(String[] args) {
        
        App app = new App();

        app.testUpperLowerCases(app.toUpperCase_f, "hello world!");
        app.testUpperLowerCases(app.toLowerCase_f, "HeLlo WoRLd2!");

        System.out.println(app.auxPrint("Hello ").apply("cshdev110!"));
        System.out.println();

        List<String> codes_l = new ArrayList<>();
        codes_l.add("Developer");
        codes_l.add("Tester");
        codes_l.add("Architect");
        codes_l.add("C++");
        codes_l.add("Java");
        codes_l.add("Python");
        codes_l.add("GO");
        codes_l.add("C#");
        codes_l.add("JavaScript");
        codes_l.add("TypeScript");

        // Filtering by word length
        app.testPredicates(codes_l, System.out::println, 10, null);
        System.out.println();
        // Filtering by matching string
        app.testPredicates(codes_l, System.out::println, 0, "C");

    }
}
