/*
 * Given a string, return a version without the first and last char, so "Hello" yields "ell". 
 * The string length will be at least 2.
 * 
 * withoutEnd("Hello") → "ell"
 * withoutEnd("java") → "av"
 * withoutEnd("coding") → "odin"
*/

public String withoutEnd(String str) {

    String s1 = "";
    for(int i = 1; i < str.length()-1; i++){
        s1 = s1 + str.charAt(i);
    }
    return s1;
}
