import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        char[] before_arr = before.toCharArray();
        char[] after_arr = after.toCharArray();
        
        Arrays.sort(before_arr);
        Arrays.sort(after_arr);
        
        if (Arrays.equals(before_arr, after_arr)) {
            return 1;
        } else {
            return 0;
        }
    }
}
