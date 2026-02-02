import java.util.List;
import java.util.ArrayList;


class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> answer = new ArrayList<>();
        int last = numbers[numbers.length - 1];
        int first = numbers[0];
        
        if(direction.equals("right")) {
             answer.add(last);
             for(int i = 0; i < numbers.length - 1; i++) {
                answer.add(numbers[i]);
            }
        } else if(direction.equals("left")) {
             for(int i = 1; i < numbers.length; i++) {                 
                answer.add(numbers[i]);
            }
             answer.add(first);
        }                       
        return answer.stream().mapToInt(i -> i).toArray();
    }
}