public String front3(String str) {

  if(str.length()<3) {
    return str+str+str;
  }

  StringBuilder sb = new StringBuilder();
  String sum = str.substring(0, 3);
  sb.append(sum);
  sb.append(sum);
  sb.append(sum);
  
  return sb.toString();
}
