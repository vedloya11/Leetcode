class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min = 0;
        int max = 0;
        for(int i =0 ; i < n ; i++){
            if(nums[i] > nums[max]){
                max = i;
            }else if( nums[i] < nums[min]){
                min = i; 
            }
        }
        int front = Math.min(min , max);
        int back = Math.max(min , max);

        int frontdel = back +1 ;
        int backdel =  n  - front;

        int together = (front +1) + (n -back);

        int ans = Math.min(frontdel , backdel);
        ans = Math.min(ans , together);
        return ans;
    }
}