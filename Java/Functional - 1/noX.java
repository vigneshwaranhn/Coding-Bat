public List<String> noX(List<String> strings) {

    for(int i=0;i<strings.size();i++) {

        strings.set(i,strings.get(i).replace("x", ""));

    }

    return strings;

}