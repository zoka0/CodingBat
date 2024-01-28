/*
 * Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
 * 
 * withoutX("xHix") → "Hi"
 * withoutX("xHi") → "Hi"
 * withoutX("Hxix") → "Hxi"
 */

public String withoutX(String str) {

    int num = 0;
    int end = str.length();
    
    if(end > 1 && str.charAt(end-1) == 'x') {
        end--;
    }

    if(end > 0 && str.charAt(0) == 'x') {
        num++;
    }

    return str.substring(num, end);
}
