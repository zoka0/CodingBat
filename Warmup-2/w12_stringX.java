public String stringX(String str) {

  String s1 = "";
  for(int i=0; i<str.length(); i++) {
    if(!(i>0 && i<str.length()-1 && str.charAt(i)=='x')) {
      s1 = s1+str.substring(i, i+1);
    }
  }

  return s1;
}
