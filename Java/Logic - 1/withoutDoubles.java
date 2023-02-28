public int withoutDoubles(int die1, int die2, boolean noDoubles) {

    int ans = 0;

    if(noDoubles) {

        if(die1 == 6 && die2 == 6) {

            ans = 7;

        }

        else if (die1 == die2) {

            ans = die1*2+1;

        }

        else {

            ans = die1+die2;

        }

    }

    else ans = die1+die2;

    return ans;

}