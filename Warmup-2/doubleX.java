/*
 * Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
 * 
 * doubleX("axxbb") → true
 * doubleX("axaxax") → false
 * doubleX("xxxxx") → true
 */

boolean doubleX(String str) {

	if(str.indexOf("xx") == -1) {
		return false;
	}else if(str.substring(str.indexOf("x"), str.indexOf("x")+2).equals("xx")){
		return true;
	}

	return false;
}
