class Solution {
    public int removeDuplicates(int[] nums) {
        int ans  = 0;
             int  i = 0;
         int j = 1;
        
        if(nums.length ==1) return 1;
       
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j+=1;
                 ans = i+1;
            }
            else{ nums[i+1]=nums[j];
                 i++;
                ans = i+1 ;}
            
        }
        return  ans ;
    }
}