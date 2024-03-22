import java.util.Scanner;

public class Solution {
    public static void nBinaryTriangle(int n) {
        // Write your code here.
        int start = 1;
        for(int i = 0; i<n; i++){
            if(i % 2 == 0) 
                start = 1;
            else 
                start = 0;
            for(int j = 0; j<i+1; j++){
                System.out.print(start + " ");
                start = 1-start;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        nBinaryTriangle(n);
        scanner.close();
    }
}
