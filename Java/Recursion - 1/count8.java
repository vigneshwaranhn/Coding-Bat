public int count8(int n) {

    if(n==0) return 0;

    else {

        int rightMostDigit = n%10;

        n /= 10;

        if(n % 10 == 8 && rightMostDigit==8) return 2 + count8(n);

        else if(rightMostDigit==8 && n%10 != 8) return 1 + count8(n);

        else return 0 + count8(n);

    }

}