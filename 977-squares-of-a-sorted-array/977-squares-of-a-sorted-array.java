class Solution {
    public int[] sortedSquares(int[] nums) {
        //iterate array
        for(int i = 0 ;i < nums.length;i++){
           // store square of ith index element
            nums[i] = nums[i]*nums[i] ;
        }
        //sort the array
       Arrays.sort(nums);
        return nums ;
        
        
    }
}