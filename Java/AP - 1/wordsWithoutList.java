public List wordsWithoutList(String[] words, int len) {

    ArrayList<String> res = new ArrayList<String>();

    for(int i = 0; i < words.length; i++) {

        if(words[i].length() != len) {

            res.add(words[i]);

        }

    }
    
    return res;

}