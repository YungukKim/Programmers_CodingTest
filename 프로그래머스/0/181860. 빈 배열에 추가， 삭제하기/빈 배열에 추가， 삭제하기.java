import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> answer_list = new ArrayList<>();
        
        for(int i = 0; i < flag.length; i++){
            if(flag[i] == true){
                for(int j = 0; j < arr[i] * 2; j++){
                    answer_list.add(arr[i]);
                }
            }else{
                for(int k = 0; k < arr[i]; k++){
                    answer_list.remove(answer_list.size() - 1);
                }
            }
        }
        return answer_list.stream().mapToInt(Integer::intValue).toArray();
    }
}