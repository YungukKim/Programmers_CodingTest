class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum_even = 0;
        int sum_odd = 0;
        
        for(int i = 0; i < num_list.length; i+=2){
            sum_even += num_list[i];
        }
        
        for(int i = 1; i < num_list.length; i+= 2){
            sum_odd += num_list[i];
        }
        
        if(sum_even < sum_odd){
            answer = sum_odd;
        }else if(sum_even > sum_odd){
            answer = sum_even;
        }else{
            answer = sum_even;
        }
        return answer;
    }
}