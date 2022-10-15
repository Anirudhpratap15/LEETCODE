class Solution {
    public int missingNumber(int[] nums) {
   int i =0 ;
        //using cycle sort  sorting based on index 0 - n  
        while(i<= nums.length-1){
            // finding correct index of element at ith index  as index and element should be same bcoz range of array is [0,n]
            int correctIndex = nums[i];
            //ignoring length(last element) element as  one  number  is missing so that one index is not present in array so  we cannot swap that last element with last index  
            if (nums[i]!= nums.length&&nums[i]!=nums[correctIndex]){
                swap(i,correctIndex,nums);
            }
            else i++;
        }
        
        // if index not match with element then index is the ans 
        for(int j = 0 ; j<nums.length;j++){
            if(j!=nums[j]){
                return j;
            }
        }

// if last number of array is missing 
        return nums.length;
        
    }
    
     private  void swap(int x, int y,int [] nums) {
        int temp =  nums[x];
        nums[x]= nums[y];
        nums[y] = temp;
    }
}