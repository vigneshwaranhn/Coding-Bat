public boolean twoTwo(int[] nums) {

    for(int i = 0; i < nums.length; i++) {

        if(nums[i] == 2) {
            
            int numberoftwos = 0;
            
            while(i < nums.length && nums[i] == 2) {
            
                numberoftwos++;
            
                i++;
            
            }
            
            if(numberoftwos == 1) return false;
        
        }
        
    }

    return true;
    
}