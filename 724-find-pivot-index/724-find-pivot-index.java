class Solution {
    public int pivotIndex(int[] nums) {
     
        int k = 0;
     
        while(k<nums.length){
               int leftSum = 0 ;
        int rightSum = 0 ;
            if(k==0 ){
                for(int i = 1;i<nums.length;i++){
                   rightSum+=nums[i]; 
                }
                if(leftSum==rightSum){
                    return k;
                }       
            }
            else  if(k==nums.length-1){
                for(int i = nums.length-2;i>=0;i--){
                   leftSum+=nums[i]; 
                }
                if(leftSum==rightSum){
                    return k;
                }       
            }
            
            else{
                 for(int i = k+1;i<nums.length;i++){
                   rightSum+=nums[i]; 
                }
                 for(int i = k-1;i>=0;i--){
                   leftSum+=nums[i]; 
                }
                 if(leftSum==rightSum){
                    return k;
                }
                
            }
            k= k+1;
            
        }
            
        return -1 ;
            
        
        
    }
}