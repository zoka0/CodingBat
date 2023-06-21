public int max1020(int a, int b) {

  if(b > a) {
    int i = a;
    a = b;
    b = i;
  }
  if(a >= 10 && a <= 20) {
    return a;
  }else if(b >= 10 && b <= 20) {
    return b;
  }

  return 0;
}
