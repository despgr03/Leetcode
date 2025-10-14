class Solution {
    public int search(int[] nums, int target) {
        int headIndex=0;
        int tailIndex=nums.length-1;
        int index=(tailIndex)/2;
        while(headIndex<=tailIndex){
            if(target==nums[index]){
                return index;
            }else if(target>nums[index]){
                headIndex=index+1;

            }else if(target<nums[index]){
                tailIndex=index-1;         
            }
            index=(tailIndex+headIndex)/2;
        }
        return -1;
    }
}
