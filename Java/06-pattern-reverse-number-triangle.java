import java.util.Scanner;

public class Solution {
    public static void nNumberTriangle(int n) {
        // Write your code here
        for(int i = 0; i<n; i++){
            for(int j =1; j<=n-i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        nNumberTriangle(n);
        scanner.close();
    }
}
