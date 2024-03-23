import java.util.Scanner;
public class Solution {
    public static void alphaTriangle(int n) {
        // Write your code here
        for(int i = 0; i < n; i++){
            char ch = (char) ('A' + (n - 1));

            for(int j = 0; j<i+1; j++){
                System.out.print(ch + " ");
                ch--;
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
        alphaTriangle(n);
        scanner.close();
    }
}
