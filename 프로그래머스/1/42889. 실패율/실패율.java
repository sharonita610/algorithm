import java.util.*;

class Solution {
     public static int[] solution(int N, int[] stages) {
        int participants = stages.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int stage : stages) {
            map.put(stage, map.getOrDefault(stage, 0) + 1);
        }

        int passedUsers = 0;
        List<KakaoGames> results = new ArrayList<>();

        for (int level = 1; level <= N; level++) {
            Integer currentUser = map.getOrDefault(level, 0);

            int succeedUsers = participants - passedUsers;

            double ratio = 0.0;
            if (succeedUsers > 0) {
                ratio = (double) currentUser / succeedUsers;
            }
            passedUsers += currentUser;
            results.add(new KakaoGames(level, ratio));
        }


        results.sort((a, b) -> {
            if(Double.compare(b.getPercentage(), a.getPercentage()) == 0) {
                return Integer.compare(a.level, b.level);
            }
            return Double.compare(b.getPercentage(), a.getPercentage());

        });

        return results.stream().mapToInt(KakaoGames::getLevel).toArray();
    }


    private static class KakaoGames {
        private final int level;
        private final double percentage;
        public KakaoGames(int level, double percentage) {
            this.level = level;
            this.percentage = percentage;
        }

        public int getLevel() {
            return level;
        }
        public double getPercentage() {
            return percentage;
        }
    }
}