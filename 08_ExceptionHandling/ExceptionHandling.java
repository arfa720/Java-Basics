// 08_ExceptionHandling.java
public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw an exception
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
