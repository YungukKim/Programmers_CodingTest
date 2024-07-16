class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int i = 0;
        
        for(int j = k; j > 0; j--){
            answer = numbers[i%numbers.length];
            i += 2;
        }
        return answer;
    }
}