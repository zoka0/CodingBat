public String stringYak(String str) {

  String s1 = "";

  for(int i=0; i<str.length(); i++) {
    if(i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
      i+=2;
    }else{
      s1 = s1+str.charAt(i);
    }
  }

  return s1;
}
