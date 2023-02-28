public String repeatFront(String str, int n) {

    String newWord = "";

    for(int i=n; n>0; n--) {

        newWord += str.substring(0,n);

    }

    return newWord;

}