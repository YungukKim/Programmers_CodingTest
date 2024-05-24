class Solution {
    public int solution(int n) {
        int answer = 0;
        // 이중 for문 시간 초과
        /* for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i * j == n){
                    answer++;
                }
            }
        }
        return answer; */
        
        // answer는 결국 약수의 개수와 같다.
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                answer++;
            }
        }
        return answer;
    }
}