
public class InvertedPyramid {
    public static void main(String args[]) {
        int n = 8;
        int i = n;
        while (i > 0) {
            int j = n - i;
            while (j > 0) {
                System.out.print("  ");
                j--;
            }
            int star = 2 * i - 1;
            while (star > 0) {
                System.out.print("* ");
                star--;
            }
            i--;
            System.out.println();
        }
    }
}
