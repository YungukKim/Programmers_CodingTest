class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
                        ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
                        ".--","-..-","-.--","--.."};
        
        String[] splitedLetter = letter.split(" ");
        
        for(String s : splitedLetter){
            for(int i = 0; i < morse.length; i++){
                if(s.equals(morse[i])){
                    answer += Character.toString(i + 'a'); // 아스키, "a" 주의
                }
            }
        }
        return answer;
    }
}