class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int y = 1;
        
        for(int i : num_list){
            if(i % 2 == 0) {
               answer[0] += y; 
            }
            else answer[1] += y;
        }
        return answer;
    }
}