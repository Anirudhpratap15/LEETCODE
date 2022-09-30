class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> result  = new HashSet<>();
        
        if (nums == null || nums.length < 3)
            return new ArrayList<>(result);
        
       // Sort the elements
        Arrays.sort(nums);									

        // taking first element and finding other two which have equal sum to the first element  
	    for (int i = 0; i <  nums.length - 2; i++)				
	    {
	       // using two pointer 
// first pointer start from left -> i+1 
            // second pointer start from last element 
//1           //as array is sorted if sum  is less than ith element then increase the left pointer 
 //2            //as array is sorted if sum  is more than ith element then decrease the right pointer 
 

	        int left = i + 1;
			int right =  nums.length - 1;
	        
	        while (left < right)
	        {
                int sum =  nums[i] + nums[left] + nums[right];
                
	            if (sum == 0)
	            {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    //when left pointer have dublicate value skip ++
                      while(left<right&&nums[left]==nums[left+1]) left++;
                   
                    //when right pointer have dublicate value skip --
                      while(left<right&&nums[right]==nums[right-1]) right--;

                    left++;
                    right--;
	            }
                //see point 1
	            else if(sum < 0)
	                left++;
                // see point 2
	            else 													
	                right--;
	        }
	    }
        return new ArrayList<>(result);
        
    }
}