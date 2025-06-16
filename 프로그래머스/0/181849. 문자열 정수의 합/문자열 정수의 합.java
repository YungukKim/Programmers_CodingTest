import java.util.stream.Stream;

class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        int[] num_int_arr = Stream.of(num_str.split("")).mapToInt(Integer::parseInt).toArray();
        for(int i : num_int_arr){
            answer += i;
        }
        return answer;
    }
}