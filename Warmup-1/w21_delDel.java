public String delDel(String str) {

  if(str.length()>3 && str.substring(1, 4).equals("del")) {

    String s1 = str.substring(0, 1)+str.substring(4);
    return s1;
  }
  
  return str;
}
