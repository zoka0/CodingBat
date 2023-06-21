public String frontTimes(String str, int n) {

  String s1 = "";
  if(str.length()>2) {
    for(int i=0; i<n; i++) {
      s1 = s1+str.substring(0, 3);
    }
  }else {
    for(int i=0; i<n; i++) {
      s1 = s1+str;
    }
  }

  return s1;
}
