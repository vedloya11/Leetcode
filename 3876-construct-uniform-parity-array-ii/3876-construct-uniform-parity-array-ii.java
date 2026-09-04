class Solution {
    public boolean uniformArray(int[] nums1) {
       int n = nums1.length;
        int nums2[] = new int[n];
        int min = nums1[0];
        for(int i = 0 ; i < n ;i++){
            if(nums1[i] < min){
                min = nums1[i];
            }
        }
        if(min % 2 ==0){
            for(int i = 0 ; i < n ;i++){
                if(nums1[i] %2 !=0){
                    return false;
                }
            }
        }else if(min % 2 !=0){
            return true;
        }
        return true;
    }
}