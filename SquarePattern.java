
public class SquarePattern {
    public static void main(String args[]) {
        int n = 5;
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
