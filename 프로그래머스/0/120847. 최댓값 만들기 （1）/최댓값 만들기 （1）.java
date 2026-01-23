import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int length = numbers.length - 1;
        Arrays.sort(numbers);
        answer = numbers[length] * numbers[length - 1];
        return answer;
    }
}