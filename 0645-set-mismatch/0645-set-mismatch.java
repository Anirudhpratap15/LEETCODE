class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        
        int i = 0 ;
        //sorting using cycle sort
        while(i<nums.length){
            int correctIndex  = nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                swap(i,correctIndex,nums);
            }
            else{i++;}
        
        }

        //finding duplicate and missing number
        for(int j = 0 ; j<nums.length;j++){
            if(nums[j]!=j+1){
                //duplicate number
                ans[0]= nums[j];
                //missing number
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