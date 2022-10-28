class Solution {
    public boolean isPalindrome(String s) {
        //removing non alphanumeric using regex and conerting to lowercase
    String ans  = s.replaceAll(
          "[^a-zA-Z0-9]", "").toLowerCase();
        
        int start = 0 ;
        int last  = ans.length()-1 ;
        
        //checking for palindrome
         while (start < last) {
            if (ans.charAt(start) != ans.charAt(last)) {
                return false;
            }
            start++;
            last--;
        }
        
        return true;
        
        
    }
}