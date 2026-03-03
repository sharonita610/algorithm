class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int diff = 1000;

        for (int i : array) {
            int a;
            if (i > n) {
                a = i - n;
            } else {
                a = n - i;
            }
            
            if (a < diff) {
                diff = a;
                answer = i;
            } else if(a == diff) {
                if (i < answer) {
                    answer = i;
                }            
            }
        }

        return answer;
    }
}