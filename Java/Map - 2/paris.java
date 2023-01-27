public Map<String, String> pairs(String[] strings) {

    Map<String, String> map = new HashMap <String, String> ();

    for(int i = 0; i < strings.length;i++) {

        String temp = strings[i];
        
        String first = String.valueOf(temp.charAt(0));
        
        String last = String.valueOf(temp.charAt(temp.length()-1));
        
        map.put(first,last);
    }
    
    return map;

}