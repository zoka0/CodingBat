public String frontBack(String str) {

  if(str.length()<2) {
    return str;
  }
  String s1 = str.substring(1, str.length()-1);

  return str.charAt(str.length()-1) + s1 + str.charAt(0);
}
