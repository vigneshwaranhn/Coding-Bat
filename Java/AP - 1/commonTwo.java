public int commonTwo(String[] a, String[] b) {

    int bI = 0;

    int count = 0;

    for(int i =0;i<a.length;i++) {

        if(i>0&&a[i].equals(a[i-1])) {

            continue;

        }

        boolean saw = false;

        while(bI<b.length&&b[bI].compareTo(a[i])<=0) {

            if(!saw&&b[bI].equals(a[i])) {

                count++;

                saw = true;

            }

            bI++;

        }

    }

    return count;

}