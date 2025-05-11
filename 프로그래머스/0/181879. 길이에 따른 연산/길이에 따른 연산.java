class Solution {
    public int solution(int[] num_list) {
        int result = (num_list.length >= 11) ? 0 : 1;
        
        for(int num : num_list){
            if(num_list.length >= 11){
                result += num;
            }else{
                result *= num;
            }
        }
        return result;
    }
}