class Solution {
    public int[] solution(int[] array) {
        int max = array[0];
        int max_index = 0;
        
        for(int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
                max_index = i;
            }
        }
        int[] answer = {max, max_index};
        return answer;
    }
}