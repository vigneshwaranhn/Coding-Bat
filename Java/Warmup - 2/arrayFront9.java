public boolean arrayFront9(int[] nums) {

    boolean result = false;

    for(int i=0;i<nums.length;i++) {

        if(i<=3 && nums[i] == 9) 

        result = true;

    }
  
    return result;

}