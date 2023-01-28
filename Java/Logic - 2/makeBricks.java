public boolean makeBricks(int small, int big, int goal) {

    int maxBig = goal / 5;

    if(big > maxBig) {

        goal = goal - maxBig * 5;

    }

    else {

        goal = goal - big * 5;

    }

    if(small >= goal) {

        return true;

    }

    else {

        return false;

    }

}