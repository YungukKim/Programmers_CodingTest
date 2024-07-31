class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int idx_len = 0;
        
        for(int i = 0; i < dic.length;i++){
            idx_len = 0;
            for(int j = 0; j < spell.length; j++){
                if(dic[i].contains(spell[j])){
                    idx_len++;
                }
                if(idx_len == spell.length){
                    answer = 1;
                }
            }
        }
        return answer;
    }
}