class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int mult = 1;
        char[] cipers = cipher.toCharArray();
    
        for (int i = 0; i < cipers.length; i++) {
            
            if (i == (code * mult) -1) {
                answer += cipers[i];
                mult ++;
            }
        
        }
        return answer;
    }
}