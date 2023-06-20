public String notString(String str) {

  StringBuilder sb = new StringBuilder(str);

  if(str.length()>2 && str.substring(0, 3).equals("not")) {
    return str;
  }
  str = sb.insert(0, "not ").toString();

  return str;
}
