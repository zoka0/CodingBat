public boolean loneTeen(int a, int b) {

  if((a>12 && a<20) && !(b>12 && b<20)) {
    return true;
  }else if(!(a>12 && a<20) && (b>12 && b<20)) {
    return true;
  }

  return false;
}
