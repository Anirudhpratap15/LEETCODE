class Solution {
    public int[] sortedSquares(int[] nums) {
       int start = 0 ;
        int end  = nums.length-1 ;
        int [] ans = new int[nums.length] ;
        
        for(int j = end;j>=0;j--){
            if(Math.abs(nums[start])>Math.abs(nums[end])){
                ans[j] = nums[start]*nums[start];
                start++;
                
            }
            else{
                  ans[j] = nums[end]*nums[end];
                end--;
            }
        }
        return ans ;
        
    }
}