import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        
        char[] befores = before.toCharArray();
        char[] afters = after.toCharArray();
        
        Arrays.sort(befores);
        Arrays.sort(afters);

        return Arrays.equals(befores, afters) ? 1 : 0;
    }
}