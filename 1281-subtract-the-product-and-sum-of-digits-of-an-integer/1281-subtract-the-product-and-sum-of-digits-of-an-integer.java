class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        int ans = 0;
        while(n>0){
            int digit = n %10;
            product*=digit;
            sum+=digit;
            n/=10;
        }
        ans = product - sum;
        return ans;
        
    }
}