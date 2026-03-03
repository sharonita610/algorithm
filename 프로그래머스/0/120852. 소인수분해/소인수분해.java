import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                set.add(i);
                n = n / i;
            }
        }
        return set.stream()
            .mapToInt(i -> i)
            .sorted()
            .toArray();
    }
}