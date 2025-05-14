class Solution {
    public String[] solution(String[] names) {
        int length = (names.length + 4) / 5;
        String[] answer = new String[length];

        int index = 0;
        for (int i = 0; i < names.length; i += 5) {
            answer[index++] = names[i];
        }

        return answer;
    }
}
