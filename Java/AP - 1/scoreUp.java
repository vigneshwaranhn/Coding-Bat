public int scoreUp(String[] key, String[] answers) {

    int count = 0;

    for(int i = 0; i < key.length; i++) {

        if(key[i].equals(answers[i])) {

            count += 4;

        }

        else if(answers[i].equals("?")) {

            count += 0;

        }

        else {

            count--;

        }

    }

    return count;

}