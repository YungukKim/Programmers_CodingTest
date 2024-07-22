import java.util.stream.Stream;

class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int[] x_arr = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();       
        for(int i = 0; i < x_arr.length; i++){
            sum += x_arr[i];
        }
        
        if(x % sum == 0){
            return true;
        }else{
            return false;
        }
    }
}