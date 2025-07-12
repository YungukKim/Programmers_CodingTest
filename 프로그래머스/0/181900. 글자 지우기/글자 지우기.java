import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder my_string_arr = new StringBuilder(my_string);
        
        Arrays.sort(indices);
        
        for(int i = indices.length - 1; i >= 0; i--){
            my_string_arr.deleteCharAt(indices[i]);
        }
        return my_string_arr.toString();
    }
}