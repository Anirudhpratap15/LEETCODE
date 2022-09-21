class Solution {
    public int majorityElement(int[] nums) {
        //sorting array 
        Arrays.sort(nums); 
        // ans will be in n/2 as mention in question that element that appears more than ⌊n/2⌋ times. 
       int ans =  nums[nums.length/2];
        return ans ; 
}}