public boolean has271(int[] nums) {

    for(int i=0;i<nums.length-2;i++) {

        int x = nums[i];
    
        if(nums[i+1] == x + 5 && Math.abs(nums[i+2] - (x-1)) <= 2) {
    
          return true;
    
        }
  
    }
  
    return false;

}