public boolean more14(int[] nums) {

    int c1 = 0;
    
    int c4 = 0;
    
    for(int i=0;i<nums.length;i++) {
        
        if(nums[i]==1)
        
        c1++;
        
        else if(nums[i]==4)
        
        c4++;
    
    }
    
    return c1>c4;
    
}