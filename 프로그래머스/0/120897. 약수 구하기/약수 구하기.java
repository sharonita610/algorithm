import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        List<Integer> numbers = new ArrayList<>();
        
        for(int i = 1; i < n + 1; i++) {
            if(n % i == 0) {
                numbers.add(i);
            }
        }
        
        
        return numbers.stream().mapToInt(i -> i).toArray();
    }
}