class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p = 1;
        //checking array if have any zero 
          int isContainZero  = 0;
        // find product of all element in array but if contain 0 as element then product will be 0 to avoid this when 0 encounter multiply by 1 ;
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