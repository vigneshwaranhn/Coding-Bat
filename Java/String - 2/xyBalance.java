public boolean xyBalance(String str) {

    int lastX = str.lastIndexOf('x');

    int lastY = str.lastIndexOf('y');

    return lastX <= lastY;

}