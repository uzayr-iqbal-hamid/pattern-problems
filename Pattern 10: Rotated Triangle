import java.util.Scanner;

public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i+1; j++){
                System.out.print("*");
            }
            for(int j = 0; j<n-i; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
        for(int i = n-1; i>0; i--){
            for(int j = i; j>0; j--){
                System.out.print("*");
            }
            for(int j = 0; j<n-i-1; j++){
                System.out.print(" ");
            }
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
