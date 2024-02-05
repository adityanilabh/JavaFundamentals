package Generics.Parameters.MultipleParameter;
class Pair<T, U> {
    private T first;
    private U second;

    // Constructor
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    // Getter for the first element
    public T getFirst() {
        return first;
    }

    // Getter for the second element
    public U getSecond() {
        return second;
    }

    // Setter for the first element
    public void setFirst(T first) {
        this.first = first;
    }

    // Setter for the second element
    public void setSecond(U second) {
        this.second = second;
    }
}