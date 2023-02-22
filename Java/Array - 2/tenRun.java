public int[] tenRun(int[] nums) {

    int change = 0;
  
    boolean condition = false;
  
    for(int i = 0; i < nums.length; i++) {
    
        if(nums[i] % 10 == 0) {
      
            condition = true;

            change = nums[i];
        
        }
        
        if (condition) {
      
            nums[i] = change;
        
        }
    
    }
    
    return nums;
    
}