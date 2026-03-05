import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i : numlist) {
            list.add(i);
        }

        list.sort((a, b) -> {
            int A = Math.abs(a - n);
            int B = Math.abs(b - n);

            if (A == B) {
                return b - a;
            }
            return A - B;
        });
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}