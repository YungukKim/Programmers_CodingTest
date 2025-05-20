import java.util.Arrays;

class Solution {
    public int[] solution(int n, int k) {
        int[] answer_arr = new int[n / k];
        for(int i = 0; i < answer_arr.length; i++){
            answer_arr[i] = k * (i + 1);
        }
        return answer_arr;
    }
}