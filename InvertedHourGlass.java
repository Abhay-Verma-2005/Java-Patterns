import java.util.*;
public class InvertedHourGlass {
    public static void main(String args[]) {
Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(j + " ");
            }

            for (int j = 2 * i - 1; j >= 1; j--) {
                System.out.print("  ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(j + " ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("  ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
 
    }
}