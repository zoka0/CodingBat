public int last2(String str) {

  int count = 0;
  if(str.length()<2) {
      return count;
  }

  String endStr = str.substring(str.length()-2);
  for(int i = 0; i < str.length()-2; i++) {
      if (endStr.equals(str.substring(i, i+2))) {
          count++;
      }
  }

  return count;
}
