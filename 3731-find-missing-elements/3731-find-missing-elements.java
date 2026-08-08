class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> output = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int min = nums[0];
        int max = nums[0];
        for(int i = 0 ; i < nums.length ;i++){
                set.add(nums[i]);
                min=Math.min(nums[i],min);
                max=Math.max(nums[i],max);
        }
        for(int i = min ; i < max ; i++){
            if(!set.contains(i)){
                output.add(i);
            }
        }
        return output;   
    }
}