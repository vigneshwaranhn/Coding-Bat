public int[] post4(int[] nums) {

    int index = 0;
  
    for(int i = 0; i < nums.length; i++) {
    
        if(nums [i] == 4) {
        
            index = i + 1;
            
        }
    
    }
  
    int[] result = new int[nums.length - index];
    
    for(int i = 0;i<nums.length-index;i++) {
        
        result[i] = nums[i + index];
    
    }
    
    return result;

}