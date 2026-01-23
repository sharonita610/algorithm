class Solution {
    public int solution(int n) {
     int answer = 0;
		String request1 = String.valueOf(n);
		char[] request = request1.toCharArray();
		for(char re : request) {
			answer +=  Integer.parseInt(String.valueOf(re));
		}
		return answer;
    }
}