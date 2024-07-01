class Solution {
    public String solution(String my_string) {
        char[] my_arr = my_string.toCharArray();
        
        for(int i = 0; i < my_arr.length; i++){
            for(int j = i + 1; j < my_arr.length; j++){
                if(my_arr[i] == my_arr[j]){
                    my_arr[j] = '\0';
                }
            }
        }
        StringBuilder answer = new StringBuilder();
        for(char c : my_arr){
            if(c != '\0'){
                answer.append(c);
            }
        }

        return answer.toString();
    }
}