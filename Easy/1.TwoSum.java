class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complement = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (complement.containsKey(nums[i])) {
                return new int[] { complement.get(nums[i]), i };
            }
            complement.put(target - nums[i], i);
        }
        return new int[] {};
    }
}
