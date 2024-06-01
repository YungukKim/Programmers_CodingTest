class Solution {
    public String solution(String my_string) {
        String answer = "";
        int ascii;
        
        for(int i = 0; i < my_string.length(); i++){
            ascii = (int)my_string.charAt(i);
            if(ascii >= 65 && ascii <= 90){
                answer += (char)(ascii + 32);
            }else if(ascii >= 97 && ascii <= 122){
                answer += (char)(ascii - 32);
            }else{
                answer += (char)ascii;
            }
        }
        return answer;
    }
}