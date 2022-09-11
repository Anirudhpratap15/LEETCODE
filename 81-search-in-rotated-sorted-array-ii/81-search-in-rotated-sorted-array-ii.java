class Solution {
    public boolean search(int[] nums, int target) {
        
        int start = 0 ;
        int end  = nums.length-1;
        
        while(end >=start){
            
            int mid  = start +(end - start)/2;
            
            if(nums[mid]==target){
                return true ;
            }
            
            if(nums[start] == nums[mid]&&nums[end] == nums[mid]){
                ++start;
                --end ;
            }
            //if array is sorted from start to end 
            else if(nums[start]<=nums[mid]){
                if(target>=nums[start]&&target<=nums[mid]){
                    end = mid -1;
                }
                else start = mid +1 ;
                
            }
            // array is sorted from mid to end 
            else{
                if(target >=nums[mid]&&target<=nums[end]){
                    start = mid +1 ;
                }
                else end = mid -1;
            } 
                
        }
        
        return false ;
    }
}