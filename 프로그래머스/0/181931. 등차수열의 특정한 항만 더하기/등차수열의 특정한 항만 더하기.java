class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int add = d;
        int[] answer_arr = new int[included.length];
        answer_arr[0] = a;
        
        for(int i = 1; i < answer_arr.length; i++){
            answer_arr[i] = a + add;
            add += d;
        }
        
        for(int i = 0; i < answer_arr.length; i++){
            if(included[i] == true){
                answer += answer_arr[i];
            }
        }
        return answer;
    }
}