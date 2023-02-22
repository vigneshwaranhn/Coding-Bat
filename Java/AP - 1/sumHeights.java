public int sumHeights(int[] heights, int start, int end) {

    int count = 0;

    for(int i = start; i < end; i++) {

        int temp = Math.abs(heights[i] - heights[i+1]);

        count += temp;

    }

    return count;

}