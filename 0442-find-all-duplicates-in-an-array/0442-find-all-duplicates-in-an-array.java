class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         int i =  0 ;
        List<Integer> ans = new ArrayList<>();
        while(i < nums.length){
            int correctIndex =  nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                swap(i,correctIndex,nums);
            }
            else{
                i++;
            }
        }
        
         for(int j = 0 ; j <nums.length;j++){
            if(nums[j]!=j+1){
                ans.add(nums[j]);
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