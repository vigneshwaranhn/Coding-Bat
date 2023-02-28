public int sumLimit(int a, int b) {

    String sum = String.valueOf(a+b);

    String lengthA = String.valueOf(a);

    return (sum.length() == lengthA.length()) ? a+b:a;

}