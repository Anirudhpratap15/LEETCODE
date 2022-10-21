class Solution {
    public String defangIPaddr(String address) {
        // string is immutable(not changing ) so we are using StringBuilder which is mutable 
        final StringBuilder s = new StringBuilder();
        
        //traverse original string and storing it in new string s  if (.) encounters replace that with [.] 
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.')
                s.append("[.]");
            else
                s.append(address.charAt(i));
        }
        
        return s.toString();
        
    }
}