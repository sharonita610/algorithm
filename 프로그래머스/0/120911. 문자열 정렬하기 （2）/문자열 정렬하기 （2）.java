import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        
        char[] stringList = my_string.toLowerCase().toCharArray();
        Arrays.sort(stringList);
        
        return new String(stringList);
    }
}