public String front22(String str) {

  if(str.length()<3) {
    return str+str+str;
  }
  String t = str.substring(0, 2);

  return t + str + t;
}
