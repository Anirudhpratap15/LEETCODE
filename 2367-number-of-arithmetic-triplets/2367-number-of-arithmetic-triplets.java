class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0 ;
        for(int i = 0 ;i<nums.length-2;i++){
            int left= i+1 ; 
            int right  = nums.length-1;
            while(left<right){
                int c = nums[left] - nums[i] ; 
                 int d = nums[right] - nums[left] ;
               
                if(c ==diff&&d==diff)  {
                    
                    count +=1;
             while(left<right&&nums[left]==nums[left+1]) left++ ;
        while(left<right&&nums[right]==nums[right-1]) right-- ;
                                 
               left++;
                     right--;
                                 }
                
                else if(c<diff) left++;
                  else if(d<diff) left++;
                else right-- ;
            }
        }
        return count ;
        
    }
}