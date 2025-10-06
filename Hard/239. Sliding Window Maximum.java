class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] maxSlidingWindow = new int[nums.length - k + 1];
        int max = nums[0];
        int indexMax = 0;
        if (k == nums.length) {
            for(int i=1; i<nums.length; i++){
                if(nums[i]>max){
                    max=nums[i];
                }
            }
            maxSlidingWindow[0]=max;
            return maxSlidingWindow;
        }
        for (int i = 0; i < nums.length - k + 1; i++) {
            if (i == 0) {
                for (int j = 1; j < k; j++) {
                    if (nums[j] >= max) {
                        max = nums[j];
                        indexMax = j;
                    }
                }
            } else {
                if (indexMax < i) {
                    max = nums[i];
                    indexMax=i;
                    for (int j = i+1; j < i + k ; j++) {
                        if (nums[j] >= max) {
                            max = nums[j];
                            indexMax = j;
                        }
                    }
                } else if (nums[i + k - 1] >= max) {
                    max = nums[i + k - 1];
                    indexMax = i + k - 1;
                }
            }
            maxSlidingWindow[i] = max;
        }
        return maxSlidingWindow;
    }
}
