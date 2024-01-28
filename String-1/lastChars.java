/*
 * iven 2 strings, a and b, eturn a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". 
 * f either string is length 0, use '@' for its missing char.
 * 
 * astChars("last", "chars") → "ls"
 * astChars("yo", "java") → "ya"
 * astChars("hi", "") → "h@"
 */
public String lastChars(String a, String b) {

    if(a.isEmpty()) {
        a = "@";
    }

    if(b.isEmpty()) {
        b = "@";
    }

    return a.substring(0, 1) + b.substring(b.length()-1);
}
