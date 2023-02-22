public boolean scores100(int[] scores) {

    int a = scores[0];

    for (int i = 1; i < scores.length; i++) {

        if(a ==100 && scores[i] == 100) {

            return true;

        }

        a =scores [i];

    }

    return false;

}