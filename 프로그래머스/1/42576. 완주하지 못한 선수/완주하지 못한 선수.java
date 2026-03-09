import java.util.*;
import java.util.stream.*;


class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> participantMap = new HashMap<>();

        for (String name : participant) {
            if (participantMap.containsKey(name)) {
                participantMap.put(name, participantMap.get(name) + 1);
            } else {
                participantMap.put(name, 1);
            }
        }

        for (String s : completion) {
            if (participantMap.containsKey(s)) {
                participantMap.put(s, participantMap.get(s) - 1);
            }
        }

        for (String s : participantMap.keySet()) {
            if (participantMap.get(s) >= 1) {
                answer = s;
            }
        }
        
        return answer;
    }
    
}