import java.util.Scanner;
public class Solution {
    public static void symmetry(int n) {
        // Write your code here
        for(int i = 0; i<n; i++) {
            //stars
            for(int j = 0; j<i+1; j++) 
                System.out.print("* ");
            
            //spaces
            for(int j = n; j > i+1; j--) 
                System.out.print(" ");
            

            //stars
            for(int j = 0; j<i+1; j++) 
                System.out.print("* ");

            //next row
            System.out.println();
        }

        for(int i = 0; i<n-1; i++){
            //stars
            for(int j = 0; j<n-i-1; j++)
                System.out.print("* ");

            //spaces
            for(int j = 0; j<i+1; j++)
                System.out.print(" ");

            //stars
            for(int j = 0; j<n-i-1; j++)
                System.out.print("* ");

            //next row
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        symmetry(n);
        scanner.close();
    }
}
