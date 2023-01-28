public int[] seriesUp(int n) {

    int[] array = new int[n*(n+1)/2];

    int j = 0;

    for(int i =1;i<=n;i++) {

        for(int k=1;k<(i+1); k++) {

            array[j] = k;

            j++;

        }

    }

    return array;

}