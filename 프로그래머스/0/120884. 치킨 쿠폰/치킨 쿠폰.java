class Solution {
    public int solution(int chicken) {
        int serviceChicken = 0;
        int coupons = chicken;

        while (coupons >= 10) {

            int newServiceChicken = coupons / 10;
            int reaming  = coupons % 10;

            serviceChicken += newServiceChicken;

            coupons = newServiceChicken + reaming;
        }
        return serviceChicken;
    }
}