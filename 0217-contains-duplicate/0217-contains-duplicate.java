class Solution {
    public boolean containsDuplicate(int[] nums) {
        // hashSet for storing data
        HashSet<Integer> ans = new HashSet<Integer>() ;
        // for each loop to store element one by one in hashset if not present 
       for(int num : nums){
           //if element already present return true 
           if(ans.contains(num)){
               return true ;
           }
           //if not present 
           ans.add(num);
       }
        return false ;
    }
}