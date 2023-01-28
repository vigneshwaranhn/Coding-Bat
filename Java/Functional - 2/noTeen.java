public List<Integer> noTeen(List<Integer> nums) {

    for(int i=0;i<nums.size();i++) {

        if(nums.get(i)>=13 && nums.get(i)<=19) {

            nums.remove(i);

            i--;

        }

    }

    return nums;

}