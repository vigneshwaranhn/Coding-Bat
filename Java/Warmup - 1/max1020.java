public int max1020(int a, int b) {

    boolean aInRange = (a >= 10 && a <= 20);
    
    boolean bInRange = (b >= 10 && b <= 20);

    if(aInRange && bInRange) {

        if(a>b) {

            return a;

        }

        else {

            return b;

        }

    }

    else if(aInRange) {

        return a;

    }

    else if(bInRange) {

        return b;

    }

    else {

        return 0;

    }

}