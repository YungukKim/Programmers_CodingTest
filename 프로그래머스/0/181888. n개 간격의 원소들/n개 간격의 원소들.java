import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();
        Integer num = 0;
        
        for(int i = 0; i < num_list.length; i+=n){
            num = num_list[i];
            answer.add(num);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}