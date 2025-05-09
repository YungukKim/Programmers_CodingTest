import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> strList = new ArrayList<>(Arrays.asList(strArr));
        List<String> answer = new ArrayList<>();
        
        for(String s : strList){
            if(!s.contains("ad")){
                answer.add(s);
            }
        }
        return answer.toArray(String[]::new);
    }
}