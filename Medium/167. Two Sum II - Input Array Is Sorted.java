class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int r1=0;
       int r2=0;
       boolean flag=false;
        for(int i=0; i<numbers.length; i++){
            int left=i+1;
            int right=numbers.length-1;
            int medium = left + (right - left)/2;
            while(left<=right){
                if(numbers[i]+numbers[medium]==target){
                    r1=i+1;
                    r2=medium+1;
                    flag=true;
                    break;
                }else if(numbers[i]+numbers[medium]>target){
                    right=medium-1;
                }else if(numbers[i]+numbers[medium]<target && medium>i){
                    left=medium+1;
                }else{
                    break;
                }
                medium = left + (right - left)/2;
            }
            if(flag){
                break;
            }
        }
        return new int[]{r1,r2};
    }
}
