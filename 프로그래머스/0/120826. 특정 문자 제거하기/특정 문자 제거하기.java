class Solution {
    public String solution(String my_string, String letter) {
      	char[] myString = my_string.toCharArray();
		StringBuilder answer = new StringBuilder();

		for(char s : myString) {
			if(!String.valueOf(s).equals(letter)) {
				answer.append(s);
			}
		}

		return answer.toString();
	}
}