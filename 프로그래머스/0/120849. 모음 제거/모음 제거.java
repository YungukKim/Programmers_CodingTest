class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            boolean isVowel = false;
            
            for(char vowel : vowels){
                if(c == vowel){
                    isVowel = true;
                    break;
                }
            }
            if(!isVowel){
                answer.append(c);
            }
        }
        return answer.toString();
    }
}