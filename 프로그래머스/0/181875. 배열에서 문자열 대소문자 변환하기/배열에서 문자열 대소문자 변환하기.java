class Solution {
    public String[] solution(String[] strArr) {
        strArr[0] = strArr[0].toLowerCase();
        for(int i = 1; i < strArr.length; i++){
            if(i % 2 == 0){
                strArr[i] = strArr[i].toLowerCase();
            }else{
                strArr[i] = strArr[i].toUpperCase();
            }
        }
        return strArr;
    }
}