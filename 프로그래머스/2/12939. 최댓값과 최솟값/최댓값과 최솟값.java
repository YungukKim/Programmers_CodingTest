import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        String[] s_arr = s.split(" ");
        int[] i_arr = Arrays.stream(s_arr).mapToInt(Integer::parseInt).toArray();

        int min = i_arr[0];
        int max = i_arr[0];

        for (int i = 1; i < i_arr.length; i++) {
            if (min > i_arr[i]) {
                min = i_arr[i];
            }
            if (max < i_arr[i]) {
                max = i_arr[i];
            }
        }

        return min + " " + max;
    }
}