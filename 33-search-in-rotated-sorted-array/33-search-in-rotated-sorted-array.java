class Solution {
    public int search(int[] nums, int target) {
        
        int pivot = getPivot(nums);
        int start =0;
        int end = nums.length-1 ;
        if(pivot==-1){
           return  binarySearch(nums,target,start,end);
        }
        
        if(nums[pivot]==target){
           return  pivot ;
        }
        if (target>= nums[start]){
            end = pivot- 1;
            return  binarySearch(nums,target,start ,end );
        }
        else {
            start = pivot+1;
             return  binarySearch(nums,target,start,end);
             }
        
    }
    
    int getPivot(int [] nums){
        
        int start = 0 ;
        int end = nums.length-1;
        
        while(end>=start){
            
            int mid = start + (end - start)/2;
            
            if (mid<end &&nums[mid]>nums[mid+1]){
                return mid ; 
            }
             if (mid > start &&nums[mid]<nums[mid-1]){
                return mid-1 ; 
            }
            if(nums[start]>nums[mid]){
                end = mid -1;
            }
            else start = mid +1;
            
        }
      return -1;  
    }
    
    
    int binarySearch(int[] nums,int target,int start ,int end ){
        
        while(end>=start){
            int mid = start +(end -start );
            
            if (target>nums[mid]){
                start = mid +1;
            }
            else if (target<nums[mid]){
                end  = mid -1;
            }
            else return mid;
        }
        return -1;
    }
}