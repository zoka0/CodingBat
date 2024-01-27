/*
 * Return true if the given string contains between 1 and 3 'e' chars.
 * 
 * stringE("Hello") → true
 * stringE("Heelle") → true
 * stringE("Heelele") → false
 */

public boolean stringE(String str) {

	int sum = 0;
	for(int i = 0; i < str.length(); i++) {
		if(str.substring(i, i+1).equals("e")) {
			sum++;
		}
	}

	return (sum > 0 && sum < 4);
}
