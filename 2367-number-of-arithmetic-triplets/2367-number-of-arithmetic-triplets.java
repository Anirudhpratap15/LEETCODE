class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0 ;
        
        // using two pointer
        // loop for fixed element 
        for(int i = 0 ;i<nums.length-2;i++){
            //left pointer start from fixed element +1 ;
            int left= i+1 ; 
             //right pointer start from end ;
            int right  = nums.length-1;
           
            //condition 
            while(left<right){
                // j-i
                int c = nums[left] - nums[i] ; 
                //k-j
                 int d = nums[right] - nums[left] ;
               
                if(c ==diff&&d==diff)  {
                    count +=1;
          
                    //when triplet found to remove dublicates check next values if same skip from left
             while(left<right&&nums[left]==nums[left+1]) left++ ;
                    //when triplet found to remove dublicates check next values if same skip from right
            while(left<right&&nums[right]==nums[right-1]) right-- ;
                                 
                     left++;
                     right--;
                                 }
                // if j-i is smaller than diff as array is sorted we need to move forward to increase the j-i value 
                else if(c<diff) left++;
                 // if k-j is smaller than diff as array is sorted we need to move forward to increase the k-j value 
                 // else if(d<diff) left++;
                //when j-i and  k-j  is greater  move backward
                else right-- ;
            }
        }
        return count ;
        
    }
}