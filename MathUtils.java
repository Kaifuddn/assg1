public class MathUtils {
    // Returns the sum of two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Returns the result of subtracting b from a
    public int subtract(int a, int b) {
        return a - b;
    }

    // Returns the product of a and b
    public int multiply(int a, int b) {
        return a * b;
    }

    // Returns the result of dividing a by b, handling division by zero
    public double divide(int a, int b) {
        if (b == 0) {
            return -1.0; // Return -1.0 if b is 0 to indicate an error
        }
        return (double) a / b;
    }
    public static void main(String[] args)
{
    MathUtils mu=new MathUtils();
    
    System.out.println(mu.add(2,4));
}}
