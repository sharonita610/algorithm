import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int canPick = nums.length / 2;
        int pocketMonTypes = map.size();

        return Math.min(canPick, pocketMonTypes);
    }
}