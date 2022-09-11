class Solution {
    public int findMin(int[] nums) {
        int start = 0 ;
        int end  = nums.length -1 ;
           if(nums[start]<nums[end]||nums.length==1){
             return nums[0];
            }
        
        while(end>=start){
            int mid = start +(end - start)/2;
            
            if(nums[mid+1]>nums[mid]&&nums[mid-1]>nums[mid]){
                return nums[mid];
            }
            if(nums[mid+1]<nums[mid]){
                return nums[mid+1];
            }
             else if(nums[mid]>=nums[start]){
             start = mid +1 ;
            }
            else end  = mid -1 ;
        }
        return end;
        
    }
}