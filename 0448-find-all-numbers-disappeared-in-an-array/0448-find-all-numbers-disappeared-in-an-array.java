class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i =  0 ;
        List<Integer> ans = new ArrayList<>();
        //sorting using cycle sort as array is in range [1-n]
        while(i < nums.length){
            int correctIndex =  nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                swap(i,correctIndex,nums);
            }
            else{
                i++;
            }
        }

        //finding missing number ,
        for(int j = 0 ; j <nums.length;j++){
            if(nums[j]!=j+1){
                ans.add(j+1);
            }
        }
        if(ans.size() == 0){
           return ans ;
        }
        else {
            return ans;
        }
        
    }
     private  void swap(int x, int y,int [] nums) {
        int temp =  nums[x];
        nums[x]= nums[y];
        nums[y] = temp;
    }
}