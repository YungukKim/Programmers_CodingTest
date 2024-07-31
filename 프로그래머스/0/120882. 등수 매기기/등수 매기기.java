class Solution {
    public int[] solution(int[][] score) {
        double[] avg_arr = new double[score.length];
        int[] answer = new int[score.length];
        int sum = 0;
        
         // 평균
        for(int i = 0; i < score.length; i++){
            for(int j = 0; j < 2; j ++){
                sum += score[i][j];
            }
            avg_arr[i] = sum / 2.0;
            sum = 0;
        }
        
        // 등수
        for(int k = 0; k < avg_arr.length; k++){
            int count = 1;
            for(int l = 0; l < avg_arr.length; l++){
                if(avg_arr[k] < avg_arr[l]){
                    count++;
                }
            }
            answer[k] = count;
        }
        return answer;
    }
}