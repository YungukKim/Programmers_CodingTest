import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = Arrays.toString(array);
        String[] str_arr = str.split("");
            
        for(int i = 0; i < str_arr.length; i++){
            if(str_arr[i].equals("7")){
                answer++;
            }
        }
        return answer;
    }
}