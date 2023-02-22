public int[] copyEvens(int[] nums, int count) {

    int[] res = new int[count];

    int index = 0;

    for(int i = 0; i < nums.length; i++) {

        if(index == count) {

            break;

        }

        if(nums[i] % 2 == 0) {

            res[index] = nums[i];

            index++;

        }

    }

    return res;

}