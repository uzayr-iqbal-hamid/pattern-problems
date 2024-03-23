import java.util.Scanner;

public class Solution {
    public static void alphaRamp(int n) {
        // Write your code here
        char ch = 'A';
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i+1; j++){
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        alphaRamp(n);
        scanner.close();
    }
}
