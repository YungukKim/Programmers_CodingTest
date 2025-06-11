import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();

        for (int num : arr) {
            boolean toDelete = false;
            for (int del : delete_list) {
                if (num == del) {
                    toDelete = true;
                    break;
                }
            }
            if (!toDelete) answer.add(num);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
