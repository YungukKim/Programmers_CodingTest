class Solution {
    public int solution(int n) {
        int min = 0;
        int max = 0;
        int answer = 0;
        
        if(n % 6 == 0){
            answer = n / 6;
        }else{
            for(int i = 1; i <= 6 && i <= n; i++){
                if(6 % i == 0 && n % i == 0){
                    max = i;
                }
            }
            min = (6 * n) / max;
            answer = min / 6;
        }
        return answer;
    }
}