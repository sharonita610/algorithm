import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(4, n)
            .filter(this::isComposite)
            .count();
    }

    private boolean isComposite(int num) {
      
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) return true;
        }
        return false;
    }
}