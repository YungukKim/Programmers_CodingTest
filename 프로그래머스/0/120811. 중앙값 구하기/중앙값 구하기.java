class Solution {
    public int solution(int[] array) {
        
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }   
            }
        }
        
        int mindex = array.length / 2;
        int answer = array[mindex];
        return answer;
    }
}