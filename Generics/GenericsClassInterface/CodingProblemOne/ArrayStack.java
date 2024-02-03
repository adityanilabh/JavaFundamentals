package Generics.GenericsClassInterface.CodingProblemOne;

public class ArrayStack<T> implements  GenericStack<T> {
   
    private Object[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayStack(){
        array = new Object[DEFAULT_CAPACITY];
        size=0;
    }


    @Override
    public void push(T element) {
        ensureCapacity();
        array[size++]=element;
    }

    
    @Override
    @SuppressWarnings("unchecked")
    public T pop() {
         if(isEmpty())
         {
            throw new IllegalStateException("Stack is empty");
         }
         T element= (T) array[--size];
         array[size]=null;
         return element;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T peek() {
       if(isEmpty()==true)
       {
        throw new IllegalStateException("Stack is empty");
       }
       return (T) array[size-1];
    }
    

    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            Object[] newArray = new Object[newCapacity];
    
            // Copy elements from the old array to the new array
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
    
            array = newArray;
        }
    }
}
