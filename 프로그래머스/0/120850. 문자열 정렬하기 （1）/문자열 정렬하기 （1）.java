import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>();        
        char[] stringList = my_string.toCharArray();
        
        for(int i = 0; i < stringList.length; i++) {
            if(Character.isDigit(stringList[i]) == true) {
                list.add(Character.getNumericValue(stringList[i]));
            }
        }
        
        return list.stream().sorted().mapToInt(i->i).toArray();
    }
}