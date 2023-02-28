public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {

    if(equalOk) {

        return ((a == b || b == c || (b == c && c == a)) && (b >= a && c >= b));

    }

    return (b > a && c > b);

}