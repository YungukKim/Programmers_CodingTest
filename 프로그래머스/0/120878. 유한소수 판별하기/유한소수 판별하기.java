class Solution {
    public int solution(int a, int b) {
        // 최대공약수 구하기
        int max = gcd(a, b);
        
        // 기약분수 만들기
        a /= max;
        b /= max;
        
        while (b % 2 == 0) {
            b /= 2;
        }
        
        while (b % 5 == 0) {
            b /= 5;
        }
        
        if (b == 1) {
            return 1;
        } else {
            return 2;
        }
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}