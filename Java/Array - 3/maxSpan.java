public int maxSpan(int[] nums) {

    int ans = 0;

    for(int i =0;i<nums.length;i++) {

        for(int k =0;k<nums.length;k++) {

            if(nums[i] == nums[k]) {

                int temp = k-i+1;

                if(temp>ans) {

                    ans=temp;

                }

            }

        }

    }

    return ans;

}