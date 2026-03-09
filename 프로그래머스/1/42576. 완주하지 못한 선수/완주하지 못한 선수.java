import java.util.*;
import java.util.stream.*;


class Solution {
    public String solution(String[] participant, String[] completion) {
         String answer = "";

        Map<String, Integer> participantMap = new HashMap<>();

        for (String name : participant) {
            participantMap.put(name, participantMap.getOrDefault(name, 0) + 1);
        }

        for (String s : completion) {
            participantMap.put(s, participantMap.get(s) - 1);
        }

        for (String s : participantMap.keySet()) {
            if (participantMap.get(s) != 0) {
                answer = s;
            }
        }

        return answer;
    }
    
}