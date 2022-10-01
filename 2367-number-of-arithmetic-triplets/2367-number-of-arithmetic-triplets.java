class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
    
        // taking hashMap to avoid duplicated 
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int count = 0 ;
      
        //storing values in hasmMap
        for(int i = 0 ;i<nums.length;i++){
            hashMap.put(nums[i],1);}
        
        //checking hapMap now 
        //if i+ diff is present then check for i +2*diff why ?  acc to QUE  diff = j-i  so we have taken i from start we are adding diff to i to find j 
 // similarly acc to QUE  diff = k-j  so we have taken i from start we are adding 2*diff to i to find k
        for(int i = 0 ;i<nums.length;i++){
            
           if(hashMap.containsKey(nums[i]+diff) && hashMap.containsKey(nums[i]+2*diff)){
               count+=1;
           }}
        return count ;
            
            
        }
        
}