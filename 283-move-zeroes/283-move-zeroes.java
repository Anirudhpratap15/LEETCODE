class Solution {
    public void moveZeroes(int[] nums) {
        //if length is  0 
        if(nums.length == 0 ) return ;
        
        // starting from index  0 
        int  pos =  0 ; 
        
        
        //taking all non zero element together in starting 
       for (int i = 0 ;i<nums.length;i++) {
           // for non zero move to starting pos which is  zero in start 
        if (nums[i]!= 0){ 
            nums[pos++] = nums[i];}
       }
            
        
        //placing 0 in remaing index from position which we get by filling non zero 
            while(pos<nums.length){
                nums[pos++] = 0 ;
            }
        }
    }
