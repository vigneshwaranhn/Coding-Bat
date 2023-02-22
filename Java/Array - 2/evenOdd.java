public int[] evenOdd(int[] nums) {

    int[] temp = new int[nums.length];
    
    for(int i = 0; i < nums.length; i++) {
    
        temp[i] = nums[i];
    
    }
    
    int index = 0;
    
    for(int i = 0; i < temp.length; i++) {
    
        if(temp[i] % 2 == 0) {
    
        nums[index] = temp[i];
    
        index++;
    
        }
    
    }
    
    for (int i = 0; i<temp.length; i++) {
    
        if(temp[i] % 2 != 0) {
    
        nums[index] = temp[i];
    
        index++;
    
        }
    
    }
    
    return nums;

}