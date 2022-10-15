class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        
        int i = 0 ; 
        while(i<nums.length){
            int correctIndex  = nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                swap(i,correctIndex,nums);
            }
            else{i++;}
        
        }

        for(int j = 0 ; j<nums.length;j++){
            if(nums[j]!=j+1){
                ans[0]= nums[j];
                ans[1]= j+1;
                
            }
            
        }
        return ans ;
        
    }
    private static   void swap(int x, int y,int [] nums) {
        int temp =  nums[x];
        nums[x]= nums[y];
        nums[y] = temp;
    }

}