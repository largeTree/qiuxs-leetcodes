/**
* 从一个排序过的数组中移除重复的元素 
*/
public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
        int lastIdx = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[lastIdx] != nums[i]) {
				lastIdx++;
				nums[lastIdx] = nums[i];
			}
		}
		return lastIdx + 1;
    }
}
