public boolean scoresIncreasing(int[] scores) {

    int curr = scores[0];

    for (int i = 1; i < scores.length; i++) {

        if(curr > scores[i]) {


            return false;

        }

        curr = scores[i];

    }

    return true;

}