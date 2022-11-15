class Solution {
    public int search(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        return search(nums,target,start,end);
        
    }
    
    public int search(int[] nums,int target,int start ,int end ){
        
        // taking mid of array 
        int mid = start +(end-start)/2;
        
        // base condition to stop recursion 
        if(start>end){
            return -1;
        }
        
        // if mid is equals to target 
        if(nums[mid]==target){return mid ;}
        
        
             // if mid is greater to target  then target will be in left side  
       else if(nums[mid]>target){
           return search(nums,target,start,mid-1);  // recursion 
        }
        
          // if mid is smaller to target  then target will be in right side 
       return  search(nums,target,mid+1,end);   // recursion 
        
    }
    
    
}