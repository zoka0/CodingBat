public int stringMatch(String a, String b) {

  int minLength = Math.min(a.length(), b.length());
  int count = 0;
  String aa="", bb="";

  for(int i = 0; i < minLength-1; i++) {
      aa = a.substring(i, i+2);
      bb = b.substring(i, i+2);
      if(aa.equals(bb)) {
          count++;
      }
  }

  return count;
}
