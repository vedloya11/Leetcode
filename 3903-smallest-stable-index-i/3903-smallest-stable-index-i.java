class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[n-1];
        for(int i = 0 ; i < n ; i++){
            max = Math.max(nums[i],max);
            min = min(nums, n-1 ,i);
            if(max-min <= k){
                return i;
            }
        }
        return -1;
       
    }
    int min(int[]nums , int  last , int j){
        int n = nums.length;
        int min = nums[n-1];
        for(int i = last ; i >= j ; i--){
            min = Math.min(nums[i],min);

        }
        return min;
    }
}