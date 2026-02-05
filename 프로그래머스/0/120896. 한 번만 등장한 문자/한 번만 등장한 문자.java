import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] cList = s.toCharArray();
        Arrays.sort(cList);
        String deleted = "";
        
        for(int i = 0; i < cList.length; i++) {
            
            String target = String.valueOf(cList[i]);
            if(!sb.toString().contains(target) && !deleted.contains(target)) {
                sb.append(String.valueOf(cList[i]));
            } else if (sb.toString().contains(target)) {
                int idx = sb.indexOf(String.valueOf(cList[i]));
                sb.deleteCharAt(idx);
                deleted += String.valueOf(cList[i]);
            }
        }
        return sb.toString();
    }
}