import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        List<String> result = new ArrayList<>();
        String[] arr = my_string.split(" ");
        
        for(String s : arr){
            if(!s.equals("")){
                result.add(s);
            }
        }
        return result.toArray(String[]::new);
    }
}