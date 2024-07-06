import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        int count = 0;
        
        String[] s_arr = s.split("");
        
        Arrays.sort(s_arr);
        
        for(int i = 0; i < s_arr.length; i++){
            count = 0;
            for(int j = 0; j < s_arr.length; j++){
                if(s_arr[i].equals(s_arr[j])){
                    count++;
                }
            }
            if(count == 1){
                answer += s_arr[i];
            }
        }
        return answer;
    }
}