class Solution {
    public int[] searchRange(int[] nums, int target) {
        
       
        int[] ans = {-1,-1};
        
        ans[0]= searchIndex(nums,target,true);
         ans[1]= searchIndex(nums,target,false);
        return ans ;
        
    }
    
    
    int searchIndex(int [] nums ,int target ,boolean getStartIndex){
        int ans = -1;
         int start = 0 ;
        int end = nums.length-1;
        while(end>=start){
            
           int  mid = start + (end -start)/2;
            
            if(target>nums[mid]){
                start = mid +1;
            }
            else if (target<nums[mid]){
                end = mid -1 ;
            }
            else 
            {ans = mid ;
             if(getStartIndex){
                 end = mid -1;
             }
             else start= mid +1;
            }
        }
        return ans ;
    }
}