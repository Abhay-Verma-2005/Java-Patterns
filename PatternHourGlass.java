import java.util.Scanner;

public class PatternHourGlass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, line, dec, inc, i, space, num;
        n = scanner.nextInt();
        line = 0;
        while (line <= n) {
            space = 1;
            while (space <= line) {
                System.out.print("  ");
                space++;
            }

            dec = (n - line);
            while (dec >= 0) {
                System.out.print(dec + " ");
                dec--;
            }

            inc = (n - line);
            i = 1;
            while (i <= inc) {
                System.out.print(i + " ");
                i++;
            }

            System.out.println();

            line++;
        }

        line = 1;
        while (line <= n) {
            space = line;
            while (space < n) {
                System.out.print("  ");
                space++;
            }

            num = line;
            while (num >= 0) {
                System.out.print(num + " ");
                num--;
            }

            i = 1;
            while (i <= line) {
                System.out.print(i + " ");
                i++;
            }

            System.out.println();

            line++;
        }
    }
}