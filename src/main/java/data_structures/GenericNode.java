package data_structures;

public class GenericNode<T> {

    public T value;
    public GenericNode<T> next;

    public GenericNode(T value, GenericNode<T> next) {
        this.value = value;
        this.next = next;
    }
}
