import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int i = 0;
        if(sides[i] + sides[i+1] > sides[sides.length - 1]) {
            return 1;
        } 
            return 2;
    
    }
}