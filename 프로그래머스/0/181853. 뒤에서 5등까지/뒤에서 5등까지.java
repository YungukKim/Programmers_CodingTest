import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        Arrays.sort(num_list);
        int idx = 0;
        
        for(int i = 0; i < answer.length; i++){
            answer[idx] = num_list[i];
            idx++;
        }
        
        return answer;
    }
}