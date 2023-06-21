public boolean has271(int[] nums) {
  
  for(int i=0; i<nums.length-2; i++) {
    //當前數值+5=下一個數值 & 下二個數值-(當前數值-1) 相差2以內
    if(nums[i+1]==(nums[i]+5) && Math.abs(nums[i+2]-(nums[i]-1))<3) {
      return true;
    }
  }

  return false;
}
