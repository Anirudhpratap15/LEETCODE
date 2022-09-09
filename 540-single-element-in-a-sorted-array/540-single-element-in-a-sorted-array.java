class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int start = 0 ;
        int end  = nums.length-1;
        int mid  = 0;
         
        while(end >start){
             mid  = start +(end-start)/2;
            
            if(mid %2== 0 ){
                if(nums[mid]!=nums[mid+1]){
                    end = mid -1;
                }
                else start = mid +2;
                
            }
            else if(mid %2== 1) {
                if(nums[mid]==nums[mid-1]){
                    start = mid +1;
                }
                
                else end = mid- 1;
            }
            else return nums[mid]  ;
            
        }
        return nums[start] ;
        
    }
}