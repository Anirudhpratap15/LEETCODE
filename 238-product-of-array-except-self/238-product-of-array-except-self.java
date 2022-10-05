class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        // taking array for output
        int[] ans = new int[nums.length];
        
        //taking aray for product of nums from left eg -{1,1*1,2*1,3*2} => {1,1,2,6} 
        int[] leftProduct = new int[nums.length];
        
        //as product of left from 0th index is not present taking 1 
         leftProduct[0] = 1 ;
        
       // taking product of nums from left
        for(int i = 1 ;i < nums.length;i++){
            leftProduct[i] =  leftProduct[i-1]* nums[i-1];
        }
        
        int p = 1 ;
        // multiply leftIndexProduct to right index product which is store in p as we have done for leftProduct array here we do not use new array for that  ;
          for(int i = nums.length-1 ;i>=0;i--){
            
            ans[i] =  p * leftProduct[i];
                p=p*nums[i];
              
        }
        return ans ;
        
    }
}