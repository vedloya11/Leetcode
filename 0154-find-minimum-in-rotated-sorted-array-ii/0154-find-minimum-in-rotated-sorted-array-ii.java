class Solution {
    public int findMin(int[] nums) {
        int first = 0;
        int last = nums.length - 1;
        while (first < last) {
            int mid = (first + last) / 2;
            if (nums[mid] == nums[last]) {
                last--;
            } else if (nums[mid] > nums[last]) {
                first = mid + 1;
            } else {
                last = mid;
            }
        }
        return nums[first];

    }
}