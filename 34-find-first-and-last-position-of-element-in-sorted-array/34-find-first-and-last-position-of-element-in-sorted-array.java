class Solution {
    public int[] searchRange(int[] nums, int target) {
        
       
        int[] ans = {-1,-1};
         ans[0]  = bs(nums,target,true); 
         ans[1]  = bs(nums,target,false); 
        return ans ;
    }       
        public int bs(int[] nums, int target,Boolean isTrue){
         int  start = 0 ;
        int end  = nums.length-1;
            int ans = -1;
        while(end>=start){
            int mid = start +(end - start )/2;
            
            if(target == nums[mid]){
              ans =  mid ;
                if(isTrue){
                    end = mid -1;
                }
                else start =mid +1;
            }
            else if(target > nums[mid]){
                start = mid +1 ;
            }
            else if(target <nums[mid]){ end = mid -1 ;}
            
        }
            return ans ;
        }
    }
