class Solution {
    boolean solution(String s) {
        int count_p = 0;
        int count_y = 0;
        String[] s_arr = s.split("");
        
        for(int i = 0; i < s_arr.length; i++){
            if(s_arr[i].equals("p") || s_arr[i].equals("P")){
                count_p++;
            }else if(s_arr[i].equals("y") || s_arr[i].equals("Y")){
                count_y++;
            }
        }
        if(count_p == count_y){
            return true;
        }else{
            return false;
        }
    }
}