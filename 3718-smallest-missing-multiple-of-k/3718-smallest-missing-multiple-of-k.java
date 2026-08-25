class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % k == 0) {
                set.add(nums[i]);
            }
        }
        for (int i = k; i < Integer.MAX_VALUE; i += k) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}