class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int nPrice = 12000;
        int kPrice = 2000;
        
        int serviceK = n / 10;
        int kToPay = k - serviceK;

        answer =  (n * nPrice) + (kToPay * kPrice);
        
        return answer;
    }
}