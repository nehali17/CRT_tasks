public class ReverseStringRecursion {

    public static void main(String[] args) {

        String str = "Hello";

        System.out.print("Reversed String: ");
        reverse(str, str.length() - 1);
    }

    static void reverse(String str, int index) {

        if (index >= 0) {
            System.out.print(str.charAt(index));

            reverse(str, index - 1);
        }
    }
}
