public int[] squareUp(int n) {

    int[] array = new int[n*n];

    for(int i = 0;i<n;i++) {

        for(int j=0;j<n;j++) {

            if(j<n-i-1)

            continue;

            array[i*n+j] = n-j;

        }

    }

    return array;

}