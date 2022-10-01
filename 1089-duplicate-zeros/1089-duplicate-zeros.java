class Solution {
    public void duplicateZeros(int[] arr) {
        // check for 0 if found move all next vales to 1 step forward 
     for(int i = 0 ; i<arr.length;i++){

            if(arr[i]==0){
                int j=arr.length-2;
                //starting from seconf last  moving values forward
                while(j>=i){
                    arr[j+1]= arr[j];
                    j--;
                }
                i++;
            }
        }
        
    }
}