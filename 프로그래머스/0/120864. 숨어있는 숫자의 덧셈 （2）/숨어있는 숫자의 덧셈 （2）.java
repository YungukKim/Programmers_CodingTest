class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] num_str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
        
        for(String str : num_str){
            if(!str.equals("")){
                answer += Integer.parseInt(str);
            }
        }
        return answer;
    }
}