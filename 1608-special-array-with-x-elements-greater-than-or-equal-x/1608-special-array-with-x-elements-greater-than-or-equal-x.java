class Solution {
    public int specialArray(int[] nums) {
        
    
        int ans = 0 ;
        Arrays.sort(nums);
      int x= nums[nums.length-1];
       
        for(int i = 0 ;i <=x;i++){
            int count = 0 ;
        for(int j = 0 ;j < nums.length;j++){
            
  if(nums[j]>=i){
    count = count+1;
}  
        }
         if(count == i ){
                return i;
            }}
        
        return -1  ;
    
        
            
    }
}