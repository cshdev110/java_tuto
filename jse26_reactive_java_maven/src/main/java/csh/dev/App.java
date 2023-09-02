package csh.dev;

import io.reactivex.rxjava3.core.Observable;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * @author cshdev110
 * @version 1.0
 */
public final class App {

    // About this class. Observable.
    // Observable, from Rxjava library, is a class that can be used
    // to create a stream of data that can be observed.
    // It is part of the Reactive Extension, which is a programming paradigm
    // that allows us to work with asynchronous data streams.

    private List<Integer> list1;
    private List<Integer> list2;

    public App(int multiple) {
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();

        this.fillList();

        Observable.fromIterable(this.list2)
                    .filter(x -> ((x - 1) % multiple) == 0)
                    .subscribe(System.out::println);                    
    }

    private void fillList() {
        IntStream.range(0, 31)
                    .forEach(x -> this.list1.add(x));
        IntStream.range(0, 31)
                    .forEach(x -> this.list2.add(x));
    }

    public void search(int multiple) {
        Observable.fromIterable(this.list1)
                    .filter(x -> ((x - 1) % multiple) == 0)
                    .subscribe(x -> {
                        if(x != 0) System.out.println(x);
                    }, x -> {
                        System.out.println("Error: " + x);
                    });
    }
    public static void main(String[] args) {
        App rxApp = new App(4);
        System.out.println();

        rxApp.search(8);
        
    }
}
