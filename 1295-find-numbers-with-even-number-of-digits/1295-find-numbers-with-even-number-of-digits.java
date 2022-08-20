class Solution {
    public int findNumbers(int[] nums) {
         int evenDigitCount = 0;

        for (int num : nums) {
          
            int checkEven = digitCount(num);

            if (checkEven % 2 == 0) {
                evenDigitCount++;
            }

        }
        return evenDigitCount;
      
        
    }
   
    int digitCount(int nums) {
        if (nums==0){
            return 1;
        }
        if (nums<0){
            nums= nums*-1;
        }
        int count = 0;
        while (nums > 0) {
            nums = nums / 10;
            count++;
        }
        return count;
    }
}