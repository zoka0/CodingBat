/*
 * Given a non-empty string like "Code" return a string like "CCoCodCode".
 * 
 * stringSplosion("Code") → "CCoCodCode"
 * stringSplosion("abc") → "aababc"
 * stringSplosion("ab") → "aab"
 */

public String stringSplosion(String str) {

	String s1 = new String();

	for(int i = 0; i < str.length(); i++) {
		s1 = s1+str.substring(0, i+1);
	}
	
	return s1;
}
