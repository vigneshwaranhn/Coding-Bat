public int loneSum(int a, int b, int c) {

    if(a==b && b==c) {

        return 0;

    }

    if(a==b) {

        return c;

    }

    else if(b==c) {

        return a;

    }

    else if(c==a) {

        return b;

    }

    else {

        return a+b+c;

    }

}