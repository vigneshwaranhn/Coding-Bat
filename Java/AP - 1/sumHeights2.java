public int sumHeights2(int[] heights, int start, int end) {

    int count = 0;

    for (int i = start; i < end; i++) {

        if(heights[i] < heights[i+1]) {

            count += (heights[i+1] - heights[i])*2;

        }

        else {

            count += heights[i] - heights[i+1];

        }

    }

    return count;

}