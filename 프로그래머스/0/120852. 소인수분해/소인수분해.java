import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> ans_list = new ArrayList<>();
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                while(n % i == 0) {
                    n /= i;
                }
                ans_list.add(i);
                
            }
        }
        int[] answer = new int[ans_list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = ans_list.get(i);
        }
        return answer;
    }
}