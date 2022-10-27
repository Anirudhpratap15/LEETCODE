class Solution {
    public String addStrings(String num1, String num2) {
        //taking stringBuilder as it is immutable 
        StringBuilder ans = new StringBuilder();
      
        //staring from last value of  both String 
        int i = num1.length()-1 ; 
        int j = num2.length()-1 ; 
        
        //store carry and update if required
        int carry = 0 ;
        
        
        // traverse both string from last   add last number from both string strore carry and append value in string 
        while(i>=0||j>=0||carry!=0){
            
            int x = i >= 0 ? num1.charAt(i) - '0' :  0 ;
            int y = j >= 0 ? num2.charAt(j) - '0' :  0 ;
            i--;
            j--;
            int sum = x +y+carry ;
            int value = sum%10;
            ans.append(value);           // ans  = 431
            carry =  sum/10;
            
        }
        
        // reversing string and return 
       return ans.reverse().toString();   //ans  = 143 
        
        
    }
}