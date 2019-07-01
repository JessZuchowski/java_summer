package data_structures;

// https://docs.oracle.com/javase/tutorial/java/generics/genTypes.html

public class GenericNode<T> {

    public T value;
    public GenericNode<T> next;

    public GenericNode(T value, GenericNode<T> next) {
        this.value = value;
        this.next = next;
    }
}
