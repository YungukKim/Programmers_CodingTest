class Solution {
    public int[] solution(String myString) {
        int notEql = 0;
        int answer_size = 0;

        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'x') {
                answer_size++;
            }
        }

        int[] answer = new int[answer_size + 1];
        int index = 0;

        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) != 'x') {
                notEql++;
            } else {
                answer[index++] = notEql;
                notEql = 0;
            }
        }
        answer[index] = notEql;

        return answer;
    }
}
