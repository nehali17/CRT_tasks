public class ReverseStringMaintainingSpace {

    public static void main(String[] args) {

        String str = "I Love Java";

        char[] arr = str.toCharArray();
        char[] result = new char[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                result[i] = ' ';
            }
        }

        int j = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != ' ') {

                while (result[j] == ' ') {
                    j--;
                }

                result[j] = arr[i];
                j--;
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + String.valueOf(result));
    }
}