public int[] zeroFront(int[] nums) {

    int[] temp = new int[nums.length];
    
    for(int i = 0; i < nums.length; i++) {
     
        temp[i] = nums[i];
     
        nums[i] = 0;
    
    }
    
    int index = nums.length - 1;
    
    for(int i = 0; i < temp.length; i++) {
    
        if(temp[i] != 0) {
    
            nums[index] = temp[i];
        
            index--;
    
        }
    
    }
    
    return nums;

}