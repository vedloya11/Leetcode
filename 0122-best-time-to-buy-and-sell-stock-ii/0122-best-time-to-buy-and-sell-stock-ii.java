class Solution {
    public int maxProfit(int[] nums) {
        int buy = nums[0];
        int profit =0;
        int maxprofit =0 ;
        for(int i =0 ; i < nums.length ; i++){
            if(nums[i] < buy){
                buy = nums[i];
            }else if (nums[i] - buy > profit){
                profit = nums[i]-buy;
                maxprofit += profit;
                profit =0;
                buy = nums[i];
            }
        }
        return maxprofit;
        
    }
}