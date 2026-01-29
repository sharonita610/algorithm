import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int last = numbers.length -1;
        
        int right = numbers[last] * numbers[last - 1];
        int left = numbers[0] * numbers[1];
        return Math.max(right, left);
    }
}