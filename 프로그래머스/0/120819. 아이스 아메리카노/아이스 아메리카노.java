class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int price = 5500;
        int i = 0;
        answer[i] = money / price;
        answer[i+1] = money - (price * answer[i]);
        return answer;
    }
}