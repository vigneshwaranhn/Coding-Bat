public List<Integer> noNeg(List<Integer> nums) {

    for(int i=0;i<nums.size();i++) {

        if(nums.get(i)<0) {

            nums.remove(i);

            i--;

        }

    }

    return nums;

}