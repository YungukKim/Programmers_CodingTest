class Solution {
    public int[] solution(int money) {
        int cup = money / 5500;
        int rest = money - cup * 5500;
        int[] answer = {cup, rest};
        return answer;
    }
}