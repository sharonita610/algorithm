class Solution {
    public long solution(int balls, int share) {
        long answer = 1;

        
        if(share > balls / 2) {
            share = balls - share;
        }

        for (int i = 1; i <= share; i++) {
            answer *= (balls - i + 1);
            answer /= i;
        }
        return answer;
    }
}