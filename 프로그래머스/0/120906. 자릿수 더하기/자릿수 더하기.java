import java.util.stream.Stream;

class Solution {
    public int solution(int n) {
        int[] arr = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        int answer = 0;
        
        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        
        
        return answer;
    }
}