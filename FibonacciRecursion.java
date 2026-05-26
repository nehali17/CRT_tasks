public class FibonacciRecursion {

    public static void main(String[] args) {

        int n = 7;   // Number of terms
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        if (n >= 1) {
            System.out.print(a + " ");
        }

        if (n >= 2) {
            System.out.print(b + " ");
        }

        fibonacci(a, b, n - 2);
    }

    static void fibonacci(int a, int b, int n) {

        if (n > 0) {
            int c = a + b;
            System.out.print(c + " ");

            fibonacci(b, c, n - 1);
        }
    }
}