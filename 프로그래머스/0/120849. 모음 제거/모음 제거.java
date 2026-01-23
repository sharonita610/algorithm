class Solution {
    public String solution(String my_string) {
		char[] s = {'a', 'e', 'i', 'o', 'u'};

		for (char c : s) {
			my_string = my_string.replaceAll(String.valueOf(c), "");
		}
		return my_string;
    }
}