public boolean has77(int[] nums) {

    for (int i = 1; i < nums.length; i++) {
    
        if (nums[i]==7&&nums[i-1]==7)

        
        return true;
    }

    for (int i = 0; i < nums.length-2; i++) {
    
        if (nums[i]==7&&nums[i+2]==7)
    
        return true;
    
    }
    
    return false;

}