class Solution {
    public int solution(int n) {
        int answer = 0;
        int factorial = 1;
        int i = 1;

        while (true) {
            factorial *= i;
            if (factorial > n) {
                break;
            }
            answer = i;
            i++;
        }
        
        return answer;
    }
}