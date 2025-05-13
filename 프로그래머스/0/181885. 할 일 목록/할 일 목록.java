import java.util.Arrays;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int answer_length = 0;

        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                answer_length++;
            }
        }

        String[] answer = new String[answer_length];
        int index = 0;

        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                answer[index++] = todo_list[i];
            }
        }

        return answer;
    }
}
