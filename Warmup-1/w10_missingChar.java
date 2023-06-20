public String missingChar(String str, int n) {

  StringBuilder sb = new StringBuilder();
  sb.append(str.substring(0, n));
  sb.append(str.substring(n+1, str.length()));

  return sb.toString();
}
