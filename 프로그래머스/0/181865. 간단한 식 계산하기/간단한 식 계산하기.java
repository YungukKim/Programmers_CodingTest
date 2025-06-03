import java.util.Arrays;

class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] binomial_arr = binomial.split(" ");
        String[] number_str = new String[2];
        number_str[0] = binomial_arr[0];
        number_str[1] = binomial_arr[2];
        
        int[] number_int = Arrays.stream(number_str).mapToInt(Integer::parseInt).toArray();
        
        if(binomial_arr[1].equals("+")){
            answer = number_int[0] + number_int[1];
        }else if(binomial_arr[1].equals("-")){
            answer = number_int[0] - number_int[1];
        }else if(binomial_arr[1].equals("*")){
            answer = number_int[0] * number_int[1];
        }
        
        return answer;
    }
}