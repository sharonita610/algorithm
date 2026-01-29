import java.util.Arrays;

class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] array = rsp.split("");
        
        for(String c : array) {
            if (c.equals("0")) {
                answer += "5";
            } else if (c.equals("2")) {
                answer += "0";
            } else {
                answer += "2";
            }
        }
        return answer;
    }
}