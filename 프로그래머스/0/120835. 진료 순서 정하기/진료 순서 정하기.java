import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        List<Integer> emergencyList = new ArrayList<>();
        for (int em : emergency) {
            emergencyList.add(em);
        }

        emergencyList.sort(Comparator.reverseOrder());

        for(int i = 0; i < emergency.length; i++){
            int emer = emergency[i];
            answer[i] = emergencyList.indexOf(emer) + 1;
        }

        return answer;
    }
    
}