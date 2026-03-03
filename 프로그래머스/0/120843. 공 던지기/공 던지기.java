class Solution {
    public int solution(int[] numbers, int k) {
        int targetIndex = (2 * (k - 1)) % numbers.length;
    
        return numbers[targetIndex];
    }
}