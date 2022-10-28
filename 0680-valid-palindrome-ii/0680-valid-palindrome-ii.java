class Solution {
    public boolean validPalindrome(String s) {
     int start = 0, end = s.length() - 1;
        
        // we can remove only one char when condition is char(start)!=char(end)   after this checking for palindrome   if again this char(start)!=char(end) occurs  means not a palindrome 
        while (start <  end) {
            if (s.charAt(start) != s.charAt(end)) {
                //checking for removing left and right char if any one is palindrome or not 
                return isPalindrome(s, start + 1, end) || isPalindrome(s, start, end - 1);
            }
            start++;
            end--;
        }

        return true;
    }
    
    private boolean isPalindrome(String s, int start, int end) {
        
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        
        return true;
        
        
    }
}