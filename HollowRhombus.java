import java.util.*;
public class HollowRhombus {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        for(int i = 1; i <= n; i++){
            for (int k = n - i; k >= 1; k--){
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++){
                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}