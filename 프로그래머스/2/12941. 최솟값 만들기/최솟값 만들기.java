import java.util.Arrays;

class Solution{
    public int solution(int[] A, int[] B){
        int answer = 0;

        //오름차순 정렬
        Arrays.sort(A);
        
        //내림차순 정렬
        Arrays.sort(B);
        for(int i = 0; i < B.length / 2; i++){
            int temp = B[i];
            B[i] = B[B.length - 1 - i];
            B[B.length - 1 - i] = temp;
        }
        for(int i = 0; i < A.length; i++){
            answer += A[i] * B[i];
        }
        
        return answer;
    }
}