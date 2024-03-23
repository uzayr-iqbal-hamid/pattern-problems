import java.util.Scanner;

public class Solution {
    public static void getNumberPattern(int n) {
        // Write your code here.
        for(int i = 0; i<2*n-1; i++){
            for(int j = 0; j<2*n-1; j++){
                int top = i;
                int left = j;
                int right = (2*n - 2) - j;
                int bottom = (2*n - 2) - i;
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(right, left)));
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        getNumberPattern(n);
        scanner.close();
    }
}
