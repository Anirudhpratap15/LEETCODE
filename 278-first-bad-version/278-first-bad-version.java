/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int start = 1;
        int end = n;
        int ans = 0 ;
        
        // if(isBadVersion(1)){
        //     return 1;
        // }
        
        while(end>start){
            int mid = start+(end - start)/2;
            if(isBadVersion(mid)){
                end = mid;
            }
            else start =mid+1;
             ans = mid ;
            
        }
        return start ;
        
        
        
    }
}