class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < index_list.length; i++){
            result.append(my_string.charAt(index_list[i]));
        }
        return result.toString();
    }
}