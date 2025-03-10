import java.util.*;
public class DoubleSideArrow {
    public static void main(String args[]) {
Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= (n + 1) / 2; i++) {
            for (int j = 1; j <= (2 * (n + 1 - 2 * i)); j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }

            for (int j = 1; j < (4 * (i - 1) - 1); j++) {
                System.out.print(" ");
            }
            if (i > 1) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }

        for (int i = n / 2; i > 0; i--) {
            for (int j = 1; j <= (2 * (n + 1 - 2 * i)); j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }

            for (int j = 1; j < (4 * (i - 1) - 1); j++) {
                System.out.print(" ");
            }
            if (i > 1) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
 
    }
}