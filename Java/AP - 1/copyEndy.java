public int[] copyEndy(int[] nums, int count) {

    int[] res = new int[count];

    int index = 0;

    for(int i = 0; i < nums.length; i++) {

        if(index == count) {

            break;

        }

        if(isEndy(nums[i])) {

            res[index] = nums[i];

            index++;

        }

    }

    return res;

}

public boolean isEndy(int n) {

    if((n >= 0 && n<=10)||(n >= 90 && n <= 100)) {

        return true;

    }

    return false;

}