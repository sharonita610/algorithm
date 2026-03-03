import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
         List<String> result = new ArrayList<>();

        int index = 0;
        StringBuilder sb = new StringBuilder(my_str);

        while (sb.length() > n) {
            String substring = sb.substring(index, n);
            sb.delete(index, n);
            result.add(substring);
        }
        
        result.add(sb.toString());
        return result.toArray(String[]::new);
    }
}