import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int index = 0;
        int[] answer = new int[num_list.length - 5];
        Arrays.sort(num_list);
        for(int i = 5; i < num_list.length; i++){
            answer[index] = num_list[i];
            index++;
        }
        return answer;
    }
}