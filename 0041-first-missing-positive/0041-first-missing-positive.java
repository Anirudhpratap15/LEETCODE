class Solution {
    public int firstMissingPositive(int[] nums) {
      int i = 0 ;
        //sorting using cycle sort as we want smallest postive number so ans is in the range  [1-n] if not then n+1 is the ans 
        while(i<nums.length){
            int correctIndex= nums[i]-1;
            //ignoring negative number and number larger then length
            if(nums[i]>0&&nums[i]<=nums.length&&nums[i]!=nums[correctIndex]){
                swap(i,correctIndex,nums);
            }
            else{i++;}
        }
        
        
        //find smallest  missing number 
        for(int j =0 ;j<nums.length;j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        
        return nums.length+1;
    }
     private static   void swap(int x, int y,int [] nums) {
        int temp =  nums[x];
        nums[x]= nums[y];
        nums[y] = temp;
    }
}