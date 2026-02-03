class Solution {
    public int solution(int order) {
        int answer = 0;
        String orders = String.valueOf(order);
        
        for(char c : orders.toCharArray()) {
            if(c == '3' || c == '6'|| c == '9') answer++;
        }
        
        return answer;
    }
}