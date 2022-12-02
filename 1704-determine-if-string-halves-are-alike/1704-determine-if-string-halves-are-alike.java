class Solution {
    public boolean halvesAreAlike(String s) {
        
        //stroring vowels in set 
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        //storing count 
        int ans = 0 ;
        
        int j = s.length()/2;
        // for loop till half of the array 
        for(int i = 0 ; i <s.length()/2;i++){
            
            //checking first half array 
            if(set.contains(s.charAt(i))) ans++ ;
                //checking second  half array 
            if(set.contains(s.charAt(j+i))) ans--;
        }
        
        // count 0 because in for loop we are decreasing the count if we get vowels in second half 
        if(ans == 0 ){ 
            return true ; 
        }
        return false  ;
        
        
        
    }
}