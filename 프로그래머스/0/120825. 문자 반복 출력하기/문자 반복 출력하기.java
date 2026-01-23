class Solution {
    public String solution(String my_string, int n) {
     
		char[] charArray = my_string.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (char c : charArray) {
			sb.append(String.valueOf(c).repeat(Math.max(0, n)));

		}

		return sb.toString();
    }
}