/*
 * Given an int array length 2, return true if it contains a 2 or a 3.
 * 
 * has23([2, 5]) → true
 * has23([4, 3]) → true
 * has23([4, 5]) → false
 */

public boolean has23(int[] nums) {

	if(Arrays.asList(2, 3).contains(nums[0]) || Arrays.asList(2, 3).contains(nums[nums.length-1])) {
		return true;
	}

	return false;
}