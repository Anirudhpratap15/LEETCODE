class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer,Integer>  occ  = new HashMap();
        
       // HashSet<Integer>  uniqueValue  = new HashSet();
        
        for(int num : arr){
            occ.put(num,occ.getOrDefault(num,0)+1);
        }
         HashSet<Integer>  uniqueValue  = new HashSet(occ.values());
        
       return occ.size()==uniqueValue.size();
        
    }
}