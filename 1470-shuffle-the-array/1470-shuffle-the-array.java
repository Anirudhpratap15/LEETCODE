class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int ans [] = new int[len];
        
        int x= 0;
        for (int i =0; i <n;i++){
           // int x= 0;
            ans[x] = nums[i];
            x++;
            ans[x] = nums[n+i];
            x++;
            
            
            
        }
        return ans ;
    }
}