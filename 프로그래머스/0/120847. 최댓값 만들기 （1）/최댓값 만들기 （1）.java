import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        /* int max = 0;
        
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(max < numbers[i] * numbers[j]){
                    max = numbers[i] * numbers[j];
                }
            }
        }
        return max; */
        
        // 더 효율적인 풀이
        Arrays.sort(numbers);
        int n = numbers.length;
        
        return numbers[n - 1] * numbers[n - 2];
    }
}