/*
 * Given an int array length 2, return true if it does not contain a 2 or 3.
 * 
 * no23([4, 5]) → true
 * no23([4, 2]) → false
 * no23([3, 5]) → false
 */

public boolean no23(int[] nums) {

	if(!Arrays.asList(2, 3).contains(nums[0]) && !Arrays.asList(2, 3).contains(nums[nums.length-1])) {
		return true;
	}

	return false;
}