package Generics.GenericsClassInterface.CodingProblemOne;

public interface GenericStack<T> {
    void push(T element);

    T pop();

    boolean isEmpty();

    T peek();
}
