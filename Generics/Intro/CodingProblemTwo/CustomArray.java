package Generics.Intro.CodingProblemTwo;

public class CustomArray<T> {
    private Object[] array;

    public CustomArray(int size)
    {
        array = new Object[size];
    }

    public void setElement(int index, T element)
    {
        array[index]=element;
    }

    @SuppressWarnings("unchecked")
    public T getElement(int index)
    {
        return (T) array[index];
    }
}
