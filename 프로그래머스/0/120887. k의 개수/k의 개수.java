class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String strK = String.valueOf(k);
        
        for(int start = i; start <= j; start++){
            String value = String.valueOf(start);
            if(value.contains(strK)){
                String[] arr = value.split("");
                for(String alp : arr){
                    if(alp.equals(strK)){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}