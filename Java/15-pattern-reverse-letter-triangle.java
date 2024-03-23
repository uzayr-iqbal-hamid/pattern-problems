import java.util.Scanner;

public class Solution {
    public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i = n; i>0; i--){
            for(char ch = 'A'; ch<'A'+i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        nLetterTriangle(n);
        scanner.close();
    }
}
