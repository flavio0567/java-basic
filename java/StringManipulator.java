class StringManipulator 
{
    String trimAndConcat(String a , String b ) {
        return (a.trim()+b.trim());
    }
    int getIndexOrNull(String a, char b) {
        int index = a.indexOf( b );
            return index;
    }
    int getIndexOrNull(String a, String b) {
        int index = a.indexOf( b );
            return index;
    }
    String concatSubstring(String a, int b, int c, String d) {
        String index = a.substring(b,c);
        String result = index.concat(d);
        return result;
    }
}