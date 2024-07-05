import java.lang.Math;

class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int minDiff = Math.abs(array[0] - n); // 절댓값

        for (int i = 1; i < array.length; i++) {
            int currentDiff = Math.abs(array[i] - n);
            if (currentDiff < minDiff) {
                minDiff = currentDiff;
                answer = array[i];
            } else if (currentDiff == minDiff && array[i] < answer) {
                answer = array[i];
            }
        }
        return answer;
    }
}

