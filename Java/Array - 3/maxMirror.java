public int maxMirror(int[] nums) {

    int len = nums.length,count = 0,max=0;

    for(int i=0;i<len;i++) {

        count = 0;

        for(int j = len - 1;j>-1 && i + count < len;j--) {

            if(nums[i+count] == nums[j]) {

                count++;

            } else {

                if(count > 0) {

                    max=Math.max(count,max);

                    count = 0;

                }

            }

        }

        max = Math.max(count,max);

    }

    return max;

}