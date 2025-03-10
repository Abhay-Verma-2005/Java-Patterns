
public class XPattern {
    public static void main(String args[]) {
        int n = 5;
        int row = 1;
        while (row <= n) {
            int star = 1;
            while (star <= n) {
                char x = (row == star || star == n - row + 1) ? '*' : ' ';
                System.out.print(x + " ");
                star++;
            }
            row++;
            System.out.println();
        }
    }
}
