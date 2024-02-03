/*
 * Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. 
 * Return the changed array.
 * 
 * maxEnd3([1, 2, 3]) → [3, 3, 3]
 * maxEnd3([11, 5, 9]) → [11, 11, 11]
 * maxEnd3([2, 11, 3]) → [3, 3, 3]
 */

public int[] maxEnd3(int[] nums) {

	int firstNum = 0;
	int[] numArr = new int[nums.length];
	firstNum = (nums[0] > nums[nums.length-1])? nums[0]:nums[nums.length-1];

	// for(int i = 0; i < nums.length; i++) {
	// 	numArr[i] = firstNum;
	// }

	// 使用 Arrays.fill() 方法將所有元素設定為相同的值
	Arrays.fill(numArr, firstNum);

	return numArr;
}