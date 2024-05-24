class Solution {
    public int solution(int hp) {
        /* int answer = 0;
        
        int ant1 = 0;
        int ant2 = 0;
        int ant3 = 0;
        
        int rest1 = 0;
        int rest2 = 0;
    
        ant1 = hp / 5;
        rest1 = hp % 5;
        
        ant2 = rest1 / 3;
        rest2 = rest1 % 3;
        
        ant3 = rest2 / 1;
        
        return answer = ant1 + ant2 + ant3; */

        return (hp / 5) + ((hp % 5) / 3) + (hp % 5) % 3;
    }
}