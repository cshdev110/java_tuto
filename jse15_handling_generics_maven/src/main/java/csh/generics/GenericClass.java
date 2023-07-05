package csh.generics;

/**
 * @author cshdev110
 * @version 0.0.1
 */

public class GenericClass<T> {

    T object;

    public GenericClass(T object) {
        this.object = object;
    }

    public void getObjectType() {
        System.out.println("T type is: " + object.getClass().getSimpleName());
    }
    
}
