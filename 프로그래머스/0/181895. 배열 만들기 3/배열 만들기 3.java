import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> answer_list = new ArrayList<>();
        
        for (int[] interval : intervals) {
            int start_idx = interval[0];
            int end_idx = interval[1];
            for (int i = start_idx; i <= end_idx; i++) {
                answer_list.add(arr[i]);
            }
        }

        return answer_list.stream().mapToInt(Integer::intValue).toArray();
    }
}
