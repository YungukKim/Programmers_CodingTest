class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++){
            String[] ex = quiz[i].split(" ");
            if(ex[1].equals("+")){
                if(Integer.parseInt(ex[0]) + Integer.parseInt(ex[2]) == Integer.parseInt(ex[4])){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }else if(ex[1].equals("-")){
                if(Integer.parseInt(ex[0]) - Integer.parseInt(ex[2]) == Integer.parseInt(ex[4])){
                    answer[i] = "O";    
                }else{
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}