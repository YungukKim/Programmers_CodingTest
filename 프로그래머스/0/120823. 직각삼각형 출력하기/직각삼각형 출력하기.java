import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){ // 줄 수
            for(int j = 1; j <= i; j++){
                System.out.print("*"); // 줄당 별 수
            }
            System.out.println(); // 줄 바꾸기
        }
    }
}