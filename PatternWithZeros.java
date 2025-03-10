import java.util.Scanner;

public class PatternWithZeros{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int line = 1;
        while (line <= n) {
            int i = 1;
            while (i <= line) {
                if (i == 1 || i == line) {
                    System.out.print(line + " ");
                } else {
                    System.out.print("0 ");
                }
                i++;
            }
            System.out.println();
            line++;
        }
    }
}