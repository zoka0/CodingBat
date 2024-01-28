/* 
 * Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
 * 
 * lastTwo("coding") → "codign"
 * lastTwo("cat") → "cta"
 * lastTwo("ab") → "ba"
 */

public String lastTwo(String str) {

    int endLen = str.length();
    if(endLen < 2) {
        return str;
    }
    
    return str.substring(0, endLen-2) + str.substring(endLen-1) + str.substring(endLen-2, endLen-1);
}
