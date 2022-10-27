class Solution {
    public String longestCommonPrefix(String[] strs) {
        
       StringBuilder ans = new StringBuilder();
        //sorting array
        Arrays.sort(strs);
        
        //storing first and last string in char array 
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();
        
        //comparing fisrt and last char array from index 0 if matched then stored in ans 
        for(int i = 0 ;i<first.length;i++){
            if(first[i]!=last[i]){
                break;
            }
            else ans.append(first[i]);
        }
        return ans.toString();
    }
}