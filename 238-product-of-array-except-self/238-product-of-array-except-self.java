class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p = 1;
          int isContainZero  = 0;
      for(int x  : nums){
          if(x==0){
             isContainZero+=1;
              p = p*1;
          }
          else p = p*x;
      }
        
        for(int i = 0 ;i<nums.length;i++){
            if(isContainZero == 0){
                 nums[i] = p/nums[i];
            }
           else if(isContainZero == 1&&nums[i]==0){
                 nums[i] = p;
            }
            else if(isContainZero == 1&&nums[i]!=0){
                 nums[i] = 0;
            }
            else nums[i] = 0;
        }
        return nums ; 
    

}}