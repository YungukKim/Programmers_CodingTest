class Solution {
    public int solution(int[] num_list) {
        int mul_num = 1;
        int add_sq_num = 0;
        
        for(int num : num_list){
            mul_num *= num;
        }
        
        for(int num : num_list){
            add_sq_num += num;
        }
        add_sq_num *= add_sq_num;
        
        return mul_num < add_sq_num? 1 : 0;
    }
}