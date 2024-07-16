class Solution {
    public int[] solution(long n) {
        String n_str = String.valueOf(n);
        int[] answer = new int[n_str.length()];
        int count = 0;
        
        while(n > 0){
            answer[count] = (int)(n % 10);
            n /= 10;
            count++;
        }
        return answer;
    }
}