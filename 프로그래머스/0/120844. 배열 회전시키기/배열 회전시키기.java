import java.util.List;
import java.util.ArrayList;


class Solution {
    public int[] solution(int[] numbers, String direction) {
        int n = numbers.length;
        int[] answer = new int[n];
        
        if (direction.equals("right")) {
            answer[0] = numbers[n - 1];
            System.arraycopy(numbers, 0, answer, 1, n - 1);
        } else {
            answer[n - 1] = numbers[0];
            System.arraycopy(numbers, 1, answer, 0, n - 1);
        }
        
        return answer;
    }
}