class Solution {
    public int[] solution(int[] arr) {
        int length = 0;
        for(int i = 0; i < arr.length; i++){
            length += arr[i];
        }
        
        int[] answer = new int[length];
        int result_idx = 0;
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i]; j++){
                answer[result_idx++] = arr[i];
            }
        }
        return answer;
    }
}