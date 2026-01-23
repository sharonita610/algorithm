class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        int sum = 0;
        
        for(int i = 0; i < t; i++){
            if (i == 0) {
                sum = n * 2;
            } else {
                sum = sum * 2;

            }
        }
        answer = sum;
        return answer;
    }
}