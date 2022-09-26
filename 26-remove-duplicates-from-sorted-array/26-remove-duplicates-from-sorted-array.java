class Solution {
    public int removeDuplicates(int[] nums) {
        
        //taking two pointer i  and j is start from 1 index
        int ans  = 0;
             int  i = 0;
         int j = 1;
        
        if(nums.length ==1) return 1;
       
        while(j<nums.length){
            // j index element is same as ith element then skip is the element j ++ 
            if(nums[i]==nums[j]){
                j+=1;
                 ans = i+1;
            }
            //if j is not same as i th element then replace jth element with ith+1 element.
            else{ nums[i+1]=nums[j];
                 i++;
                ans = i+1 ;}
            
        }
        return  ans ;
    }
}