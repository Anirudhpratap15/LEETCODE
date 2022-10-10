class Solution {
    public int missingNumber(int[] nums) {
   int i =0 ;
        while(i<= nums.length-1){
            int correctIndex = nums[i];
            if (nums[i]!= nums.length&&nums[i]!=nums[correctIndex]){
                swap(i,correctIndex,nums);
            }
            else i++;
        }
        
        for(int j = 0 ; j<nums.length;j++){
            if(j!=nums[j]){
                return j;
            }
        }


        return nums.length;
        
    }
    
     private  void swap(int x, int y,int [] nums) {
        int temp =  nums[x];
        nums[x]= nums[y];
        nums[y] = temp;
    }
}