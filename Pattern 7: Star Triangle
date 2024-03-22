import java.util.Scanner;

public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here
        int i, j;
        for(i = 0; i<n; i++){
            for(j = 0; j < n-i-1; j++ )
                System.out.print(" ");

            for(j = 0; j<2*i+1; j++)
                System.out.print("*");

            for(j = 0; j < n-i-1; j++ )
                System.out.print(" ");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        nStarTriangle(n);
        scanner.close();
    }
}
