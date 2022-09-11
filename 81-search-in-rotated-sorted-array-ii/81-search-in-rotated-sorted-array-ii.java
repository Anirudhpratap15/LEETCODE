class Solution {
    public boolean search(int[] nums, int target) {
        
        int start = 0 ;
        int end = nums.length-1;
        
        while(end>=start){
            
            int mid  = start +(end-start)/2 ; 
            
            if(nums[mid] == target){
                return true ; 
            }
             else if (nums[start] ==nums[mid]&&nums[end] ==nums[mid]){
                end = end - 1 ;
                 start = start +1 ;
            }
            //array is sorted from start to mid 
            else if(nums[start]<=nums[mid]){
                
               if(nums[start]<=target&& target<=nums[mid]){
                    end = mid - 1 ;
               }
                 else start = mid+1 ;
            }
        // If arr[l..mid] first subarray is not sorted
        // then arr[mid... h] must be sorted subarray
            else {
                if(nums[end]>=target&& target>=nums[mid]){
                start = mid +1;
            }
                  else end = mid -1;
        }
       
         
      
    }
     return false  ;
    
    }}
