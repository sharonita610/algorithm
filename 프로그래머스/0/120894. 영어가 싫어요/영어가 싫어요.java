import java.util.*;

class Solution {
    
    private static final Map<String, String> map = new HashMap<>();

    static {
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
    }
    
    public long solution(String numbers) {
        char[] strings = numbers.toCharArray();
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (char c : strings) {
            word.append(c);
            if (map.containsKey(word.toString())) {
                result.append(map.get(word.toString()));
                word.setLength(0);
            }
        }

        return Long.parseLong(result.toString());
    }
}