class Solution {
    public String longestCommonPrefix(String[] strs) {
        // taking first string as prefix
        String prefix = strs[0];
        
        // now from 2nd string from array compare prefix 
        for(int i = 1 ; i<strs.length;i++){
            // if prefix found it will give 0 if not found -1 
           while(strs[i].indexOf(prefix)!=0){
               // when string is not matching them remove one char from last of prefix
               prefix = prefix.substring(0,prefix.length()-1);
           }
        }
        return prefix ;
        
    }
}