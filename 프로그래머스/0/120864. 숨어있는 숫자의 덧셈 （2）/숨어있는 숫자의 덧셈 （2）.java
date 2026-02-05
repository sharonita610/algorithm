class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String cleaned = my_string.replaceAll("[^0-9]", " ");
        String[] numbers = cleaned.split("\\s+");
        
        for(String s : numbers){
            if(!s.isEmpty()){
                answer += Integer.parseInt(s);
            }
        }
        return answer;
    }
}