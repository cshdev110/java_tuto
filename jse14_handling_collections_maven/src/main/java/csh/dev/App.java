package csh.dev;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author cshdev110
 * @version 0.0.1
 */
public final class App {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        System.out.println("List without specifying type parameter");
        List list1 = new ArrayList();

        list1.add(1);
        list1.add(2);
        list1.add("Collections String");
        list1.add(3);

        printOut(list1);

        System.out.println("List with specifying type parameter");
        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("Collections String");
        list2.add("3");

        printOut(list2);

        System.out.println("Set without specifying type parameter");
        Set set1 = new HashSet();
        set1.add(1);
        set1.add(2);
        set1.add("Collections String");
        set1.add(3);

        printOut(set1);

        System.out.println("Set with specifying type parameter");
        Set<String> set2 = new HashSet<>();
        set2.add("1");
        set2.add("2");
        set2.add("Collections String");
        set2.add("3");

        printOut(set2);

        System.out.println("Map without specifying type parameter");
        Map map1 = new HashMap();
        map1.put("1", "one");
        map1.put(2, "two");
        map1.put("3", "three");

        printOut(map1.keySet());
        printOut(map1.values());

        System.out.println("Map with specifying type parameter");
        Map<String, String> map2 = new HashMap<>();
        map2.put("1", "one");
        map2.put("2", "two");
        map2.put("3", "three");

        printOut(map2.keySet());
        printOut(map2.values());

        System.out.println(map2.get("2"));



    }

    private static void printOut(Collection<?> collection) {
        for (Object o : collection) {
            System.out.println("Data: " + o + " type: " + o.getClass().getSimpleName());
        }
        System.out.println("--------------------");
    }
}
