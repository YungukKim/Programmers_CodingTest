class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x = dots[0][0];
        int y = dots[0][1];
        int x_w = 0;
        int y_h = 0;
        
        for(int i = 1; i < dots.length; i++){
            if(x != dots[i][0]){
                x_w = Math.abs(x - dots[i][0]);
            }
            
            if(y != dots[i][1]){
                y_h = Math.abs(y - dots[i][1]);
            }
        }
        answer = x_w * y_h;
        return answer;
    }
}