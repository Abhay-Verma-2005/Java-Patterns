import java.util.*;
public class PatternMagic {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        n+=4;
        int i=1;
        while (i <= n){
            int j=1;
            while(j <= n){
                if (i+j<=(n+3)/2 || j-i>=(n)/2 || i-j>=n/2 || i+j>=2*n-4){
                        System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
                j++;       
                }
             i++;
            System.out.println();

        }
    }
}