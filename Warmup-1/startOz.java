/*
 * Given a string, return a string made of the first 2 chars (if present), 
 * however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
 * 
 * startOz("ozymandias") → "oz"
 * startOz("bzoo") → "z"
 * startOz("oxx") → "o"
 */

public String startOz(String str) {

	if(str.length() > 1 && str.substring(0, 2).indexOf("oz") != -1) {
		return "oz";
	}else if(str.length() > 1 && str.substring(1, 2).indexOf("z") != -1) {
		return "z";
	}else if(str.length() > 0 && str.substring(0, 1).indexOf("o") != -1) {
		return "o";
	}

	return "";
}
