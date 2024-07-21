class Solution {
    public int solution(int[] sides) {
        int count = 0;
        if(sides[0] > sides[1]){
            for(int i = sides[0] - sides[1] + 1; i <= sides[0]; i++){
                count++;
            }
            
            for(int ano_i = sides[0] + 1; ano_i < sides[0] + sides[1]; ano_i++){
                count++;
            }
        }else if(sides[0] < sides[1]){
            for(int j = sides[1] - sides[0] + 1; j <= sides[1]; j++){
                count++;
            }
            
            for(int ano_j = sides[1] + 1; ano_j < sides[0] + sides[1]; ano_j++){
                count++;
            }
        }else if(sides[0] == sides[1]){
            for(int k = 1; k < sides[0] + sides[1]; k++){
                count++;
            }
        }
        return count;
    }
}