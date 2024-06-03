import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> tempList = new ArrayList<>();
        
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                tempList.add(numlist[i]);
            }
        }
        
        int[] answer = new int[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            answer[i] = tempList.get(i);
        }
        
        return answer;
    }
}