
public class Diamond {
    public static void main(String args[]) {
        int n = 9;
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i) {
                System.out.print("  ");
                j++;
            }
            int s = 1;
            while (s <= 2 * i - 1) {
                System.out.print("* ");
                s++;
            }
            i++;
            System.out.println();
        }
        i = n - 1;
        while (i > 0) {
            int j = 1;
            while (j <= n - i) {
                System.out.print("  ");
                j++;
            }
            int s = 1;
            while (s <= 2 * i - 1) {
                System.out.print("* ");
                s++;
            }
            i--;
            System.out.println();
        }
    }
}
