import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(nCr(i, j) + "\t");
            }
            System.out.println();
            System.out.println();
        }
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int nCr(int n, int r) {
        int ncr = factorial(n) / (factorial(r) * factorial(n - r));
        return ncr;
    }
}