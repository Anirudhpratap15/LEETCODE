class Solution {
    public int pivotIndex(int[] nums) {
     // total sum 
       int totalSum = 0 ;
        //left sum
        int leftSum = 0 ;
        
        //calculating total sum
        for(int  i: nums){
            totalSum += i; 
        }
         
        // starting from index 0 we will get right sum by total sum -current index and store it 
// after that check for equals condition 
        // if not equal increase index and left sum and right sum is substracted
        for(int  i = 0 ; i <nums.length;i++){
            totalSum= totalSum-nums[i]; // will become right some 
            if(totalSum==leftSum) return i ; //condition 
            leftSum = leftSum+nums[i];   // else increase left sum 
        }
            
        return -1; // if ans  not found 
        
    }
}