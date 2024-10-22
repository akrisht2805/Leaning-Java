package Generics;

public class Box<T> {

    T container;

    // Object class is top most parent class of all java class.
    Box(T container) {
        this.container = container;
    }

    public T getValue() {
        return this.container;
    }
}
