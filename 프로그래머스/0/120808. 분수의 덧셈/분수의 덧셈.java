class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int finNumer = numer1 * denom2 + numer2 * denom1;
        int finDenom = denom1 * denom2;
        
        int max = 0;
        
        for(int i = 1; i <= finNumer && i<= finDenom; i++){
            if(finNumer % i == 0 && finDenom % i == 0){
                max = i;
            }
        }
        int[] answer = {finNumer / max, finDenom / max};
        return answer;
    }
}