import java.util.*;

class Solution {
    public int[] solution(String[] strlist) {
       	int[] answer = new int[strlist.length];
		int i = 0;

		for(String string : strlist) {
			StringBuilder st = new StringBuilder(string);
			answer[i] = st.length();
			i++;
		}
		return answer;
    }
}