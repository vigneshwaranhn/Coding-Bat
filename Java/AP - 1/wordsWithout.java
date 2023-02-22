public String[] wordsWithout(String[] words, String target) {

    int count = 0;

    for(int i = 0; i<words.length; i++) {

        if(target.equals(words[i])) {

            count++;

        }

    }

    String[] ret = new String[words.length-count];

    int index = 0;

    for(int i = 0;i<words.length; i++) {

        if(!target.equals(words[i])) {

            ret[index] = words[i];

            index++;

        }

    }

    return ret;

}