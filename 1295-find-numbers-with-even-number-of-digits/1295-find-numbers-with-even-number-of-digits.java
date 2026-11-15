class Solution {
    public int findNumbers(int[] nums) {
        int ans= 0;
        for(int i : nums){
            int x = (int)(Math.log10(i)) + 1;
            if(x % 2==0){
                ans+=1;
            }
        }
        return ans;
        
    }
}