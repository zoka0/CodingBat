public String everyNth(String str, int n) {

  String s1 = new String();
  for(int i=0; i<str.length(); i+=n) {
    s1 = s1+str.charAt(i);
  }

  return s1;
}
