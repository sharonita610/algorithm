class Solution {
    public int solution(int n) {
        int answer = 0;
        int holePizza = 7;
        
        answer = n / holePizza;
        
        if (n % holePizza != 0){
            answer ++;
        }
        return answer;
    }
}