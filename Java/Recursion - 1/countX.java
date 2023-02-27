public int countX(String str) {

    if(str.equals("")) return 0;

    else {

        char leftMostChar = str.charAt(0);

        str = str.substring(1);

        if(leftMostChar=='x') return 1 + countX(str);

        else return 0 + countX(str);

    }

}