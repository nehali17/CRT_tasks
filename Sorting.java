import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int original[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            original[i] = sc.nextInt();
        }

        // ---------------- BUBBLE SORT ----------------
        int bubble[] = new int[n];

        for (int i = 0; i < n; i++) {
            bubble[i] = original[i];
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (bubble[j] > bubble[j + 1]) {
                    int temp = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = temp;
                }
            }
        }

        System.out.println("\nBubble Sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(bubble[i] + " ");
        }

        // ---------------- INSERTION SORT ----------------
        int insertion[] = new int[n];

        for (int i = 0; i < n; i++) {
            insertion[i] = original[i];
        }

        for (int i = 1; i < n; i++) {
            int key = insertion[i];
            int j = i - 1;

            while (j >= 0 && insertion[j] > key) {
                insertion[j + 1] = insertion[j];
                j--;
            }

            insertion[j + 1] = key;
        }

        System.out.println("\n\nInsertion Sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(insertion[i] + " ");
        }

        // ---------------- SELECTION SORT ----------------
        int selection[] = new int[n];

        for (int i = 0; i < n; i++) {
            selection[i] = original[i];
        }

        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (selection[j] < selection[min]) {
                    min = j;
                }
            }

            int temp = selection[i];
            selection[i] = selection[min];
            selection[min] = temp;
        }

        System.out.println("\n\nSelection Sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(selection[i] + " ");
        }

        sc.close();
    }
}