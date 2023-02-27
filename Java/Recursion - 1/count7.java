public int count7(int n) {

    if(n==0) return 0;

    else {

        int rightMostDigit = n%10;

        n /= 10;

        if(rightMostDigit==7) return 1 + count7(n);

        else return 0 + count7(n);

    }

}