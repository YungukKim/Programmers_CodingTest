class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int x = 0;
        int y = 0;
        
        int x_Limit = board[0] / 2;
        int y_Limit = board[1] / 2;
        
        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("up")) {
                y += 1;
                if (y > y_Limit) {
                    y = y_Limit;
                }
            } else if (keyinput[i].equals("down")) {
                y -= 1;
                if (y < -y_Limit) {
                    y = -y_Limit;
                }
            } else if (keyinput[i].equals("left")) {
                x -= 1;
                if (x < -x_Limit) {
                    x = -x_Limit;
                }
            } else if (keyinput[i].equals("right")) {
                x += 1;
                if (x > x_Limit) {
                    x = x_Limit;
                }
            }
        }
        answer[0] = x;
        answer[1] = y;
        
        return answer;
    }
}
