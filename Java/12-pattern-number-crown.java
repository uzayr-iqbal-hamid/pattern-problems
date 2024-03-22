import java.util.Scanner;

public class Solution {
    public static void numberCrown(int n) {
        // Write your code here.
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i+1; j++)
                System.out.print(j+1 + " ");
            
            for(int j = 0; j<n+1; j++)
                System.out.print(" ");

            for(int j = i+1; j>0; j--)
                System.out.print(j + " ");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        numberCrown(n);
        scanner.close();
    }
}
