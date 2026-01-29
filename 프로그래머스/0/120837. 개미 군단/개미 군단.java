class Solution {
    public int solution(int hp) {
        int answer = 0;
        int result = 0;
 
        answer += hp / 5;
        hp %= 5;    
        
        answer += hp / 3;
        hp %= 3;
        answer += hp / 1;
        
        System.out.println(answer);
       
        
        
        return answer;
    }
}