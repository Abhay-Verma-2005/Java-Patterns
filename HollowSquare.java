
public class HollowSquare {
    public static void main(String args[]) {
        int n = 9;
        int row = 1;
        while (row <= n) {
            int star = 1;
            while (star <= n) {
                char x = (row == 1 || row == n || star == 1 || star == n) ? '*' : ' ';
                System.out.print(x + " ");
                star++;
            }
            row++;
            System.out.println();
        }
    }
}
