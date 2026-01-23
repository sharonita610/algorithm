class Solution {
    public int solution(String message) {
        int answer = 0;
        StringBuffer sb = new StringBuffer(message);
        answer = sb.length() * 2;
        return answer;
    }
}