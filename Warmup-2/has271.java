/*
 * Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. 
 * Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
 * 
 * has271([1, 2, 7, 1]) → true
 * has271([1, 2, 8, 1]) → false
 * has271([2, 7, 1]) → true
 */

public boolean has271(int[] nums) {
  
	for(int i = 0; i < nums.length-2; i++) {
		//當前數值+5=下一個數值 & 下二個數值-(當前數值-1) 相差2以內
		if(nums[i+1] == (nums[i]+5) && Math.abs(nums[i+2]-(nums[i]-1)) < 3) {
			return true;
		}
	}

	return false;
}
