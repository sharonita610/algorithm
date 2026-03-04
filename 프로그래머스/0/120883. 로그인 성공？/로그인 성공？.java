import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
          String answer = "fail";

        Map<String, String> database = new HashMap<>();
        for (String[] strings : db) {
            database.put(strings[0], strings[1]);
        }

        String id = id_pw[0];
        String pw = id_pw[1];

        if(database.containsKey(id)) {
            if(database.get(id).equals(pw)) {
                answer = "login";
            } else {
                answer = "wrong pw";
            }
        }
        return answer;
    }
}