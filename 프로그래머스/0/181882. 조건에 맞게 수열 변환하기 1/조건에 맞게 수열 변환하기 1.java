class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int index = 0;
        for(int num : arr){
            if(num >= 50 && num % 2 == 0){
                answer[index] = num / 2;
                index++;
            }else if(num < 50 && num % 2 == 1){
                answer[index] = num * 2;
                index++;
            }else{
                answer[index] = num;
                index++;
            }
        }
        return answer;
    }
}