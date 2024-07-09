class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        int last_num = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("Z")){
                answer -= last_num;
            }else{
                last_num = Integer.parseInt(arr[i]);
                answer += last_num;
            }
        }
        return answer;
    }
}