/*
 * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
 * 
 * altPairs("kitten") → "kien"
 * altPairs("Chocolate") → "Chole"
 * altPairs("CodingHorror") → "Congrr"
 */

public String altPairs(String str) {

	String s1 = "";
	for(int i = 0; i < str.length(); i+=4) {
		int j = i+2;
		if(i+2 > str.length()) {
			j = str.length();
		}
		s1 = s1 + str.substring(i, j);
	}

	return s1;
}
