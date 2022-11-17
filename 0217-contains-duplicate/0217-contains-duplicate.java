class Solution {
    public boolean containsDuplicate(int[] nums) {
         Arrays.sort(nums);
        for(int ind = 0 ; ind < nums.length-1; ind++) {
            if(nums[ind] == nums[ind + 1]) {
                return true;
            }
        }
        return false;
    }
}