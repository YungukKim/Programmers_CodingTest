class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0];
        int min = 0;
        
        for(int i = 0; i < sides.length; i++){
            if(max < sides[i]){
                max = sides[i];
            }else{
                min += sides[i];
            }
        }
        if(max >= min){
            answer = 2;
        }else if(max < min){
            answer = 1;
        }
        return answer;
    }
}