package Generics.classAndInterface.ProblemStatement;

class MathOperations<T> implements Calculator<T> {
    @SuppressWarnings("unchecked")
    @Override
    public T add(T num1, T num2) {
        // Assuming T is a numeric type (e.g., Integer, Double)
        if (num1 instanceof Number && num2 instanceof Number) {
            return (T) Double.valueOf(((Number) num1).doubleValue() + ((Number) num2).doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported type for addition");
        }
    }
}
