class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupons = chicken;

        while (coupons >= 10) {
            int newChicken = coupons / 10;
            answer += newChicken;
            coupons = newChicken + (coupons % 10);
        }
        return answer;
    }
}