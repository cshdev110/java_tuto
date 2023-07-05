package csh.dev;

import csh.generics.*;

/**
 * @author cshdev110
 * @version 0.0.1
 */

public final class App {
    public static void main(String[] args) {
        GenericClass<Integer> objInt = new GenericClass<Integer>(15);

        objInt.getObjectType();

        GenericClass<String> objStr = new GenericClass<String>("Hello");

        objStr.getObjectType();
    }
}
