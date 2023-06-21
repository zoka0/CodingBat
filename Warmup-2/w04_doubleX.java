boolean doubleX(String str) {

  if(str.indexOf("xx")==-1) {
    return false;
  }else if(str.substring(str.indexOf("x"), str.indexOf("x")+2).equals("xx")){
    return true;
  }

  return false;
}
