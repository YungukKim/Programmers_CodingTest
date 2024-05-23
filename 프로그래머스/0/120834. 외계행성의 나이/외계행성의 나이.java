class Solution {
    public String solution(int age) {
        String answer = "";
        String[] alp = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        
        String strAge = String.valueOf(age); // age를 문자열로 변환
        for(int i = 0; i < strAge.length(); i++){
            for(int j = 0; j < alp.length; j++){
                
                if(String.valueOf(j).equals(String.valueOf(strAge.charAt(i)))){
                    answer += alp[j];
                }
            }
        }
        return answer;
    }
}