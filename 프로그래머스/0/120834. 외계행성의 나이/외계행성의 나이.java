class Solution {
    public String solution(int age) {
       StringBuilder answer = new StringBuilder();
        
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        
        String ageString = String.valueOf(age);
        
        for(String s : ageString.split("")) {
            int index = Integer.parseInt(s);
            answer.append(alphabet[index]);
        }
        return answer.toString();
    }
}