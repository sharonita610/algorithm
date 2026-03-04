import java.util.*;
import java.util.stream.Collectors;


class Solution {
    public int[] solution(int[][] score) {
        
        int n = score.length;

        int[] answer = new int[n];
        int[] totalScores = new int[n];

        for (int i = 0; i < score.length; i++) {
            totalScores[i] = score[i][0] + score[i][1];
        }

        Map<Integer, Integer> map = new HashMap<>();

        List<Integer> sortedScores = Arrays.stream(totalScores)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        for (int i = 0; i < n; i++) {
            if (!map.containsKey(sortedScores.get(i))) {
                map.put(sortedScores.get(i), i + 1);
            }
        }

        for (int i = 0; i < n; i++) {
            answer[i] = map.get(totalScores[i]);
        }

        return answer;
    }
}