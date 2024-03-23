import java.util.Scanner;

public class Solution {
    public static void symmetry(int n) {
        // Write your code here
        for(int i = 0; i < n; i++) {
            for(int j = 0; j<n-i; j++) {
                System.out.print("* ");
            }
            
            for(int j = 0; j<2*(i+1); j++){
                System.out.print(" ");
            }

            for(int j = 0; j<n-i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<i+1; j++){
                System.out.print("* ");
            }

            for(int j = 0; j<2*(n); j++){
                System.out.print(" ");
            }

            for(int j = 0; j<i+1; j++){
                System.out.print("* ");
            }
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
