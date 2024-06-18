import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public int solution(int num, int k) {
        int[] numArray = Stream.of(String.valueOf(num).split(""))
                             .mapToInt(Integer::parseInt)
                             .toArray();

        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == k) {
                return i + 1;
            }
        }
        return -1;
    }
}
