import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
          Stack<Integer> stack = new Stack<>();
        
        for (int num : arr) {

            if (stack.isEmpty()) {
                stack.push(num);
            } else {
                Integer pop = stack.peek();
                if (pop != num) {
                    stack.push(num);
                }
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}