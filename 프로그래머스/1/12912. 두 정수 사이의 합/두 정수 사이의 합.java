class Solution {
    public long solution(int a, int b) {
       long answer = 0;
        int max = Math.max(a, b);
        if (max == a){
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        } else {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        }
        return answer;
    
    }
}
