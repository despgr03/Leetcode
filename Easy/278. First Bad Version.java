/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int headIndex=1;
        int tailIndex=n;
        int index;
        int firstBadVersion=n;
        while(headIndex<=tailIndex){
            index=headIndex+(tailIndex-headIndex)/2;
            if(isBadVersion(index)){
                firstBadVersion=index;
                tailIndex=index-1;
            }else{
                headIndex=index+1;
            }

        }
        return firstBadVersion;

    }
}
