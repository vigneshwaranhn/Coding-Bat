public boolean linearIn(int[] outer, int[] inner) {

    int indexInner = 0, indexOuter = 0;

    while(indexInner < inner.length && indexOuter < outer.length) {

        if(outer[indexOuter] == inner[indexInner]) {

            indexOuter++;

            indexInner++;

        } else

        indexOuter++;

    }

    return (indexInner == inner.length);

}