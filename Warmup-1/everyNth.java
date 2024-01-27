/*
 * Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. 
 * So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
 * 
 * everyNth("Miracle", 2) → "Mrce"
 * everyNth("abcdefg", 2) → "aceg"
 * everyNth("abcdefg", 3) → "adg"
 */

public String everyNth(String str, int n) {

	String s1 = new String();
	for(int i = 0; i < str.length(); i+=n) {
		s1 = s1+str.charAt(i);
	}

	return s1;
}
