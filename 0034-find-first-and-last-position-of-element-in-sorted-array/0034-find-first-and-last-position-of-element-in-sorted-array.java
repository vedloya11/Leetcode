class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = first(nums, target);
        res[1] = last(nums, target);
        return res;
}
       
    
    public int first(int[] nums, int target){
        int ans = -1;
        int first = 0;
        int last = nums.length -1;
       while(first <= last){
        int mid = (first + last) / 2;
        if(nums[mid] >= target){
            last = mid - 1;
        }else{
            first = mid + 1;
        }
        if(nums[mid] == target) ans = mid;
    }
    return ans;
    }  
    public int last(int[] nums, int target){
        int ans = -1;
        int first = 0;
        int last = nums.length -1;
       while(first <= last){
        int mid = (first + last) / 2;
        if(nums[mid] <= target){
            first = mid + 1;
        }else{
            last = mid - 1;
        }
        if(nums[mid] == target) ans = mid;
    }
    return ans;
    }
}
