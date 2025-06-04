class Solution {
    public int solution(String myString, String pat) {
        StringBuilder str_b = new StringBuilder();
        int answer = 0;
        
        for(int i = 0; i < myString.length(); i++){
            char ch = myString.charAt(i);
            if(ch == 'A'){
                str_b.append('B');
            }else if(ch == 'B'){
                str_b.append('A');
            }
        }
        if(str_b.toString().contains(pat)){
            answer = 1;
        }
        return answer;
    }
}