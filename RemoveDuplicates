public class RemoveDuplicates {
  /**
  * 生成两个指针
  * 快指针：指向当前遍历到的数组位置
  * 慢指针：指向当前不重复元素的位置
  * 返回慢指针+1 即为不重复元素数量
  */
  public static int removeDuplicates(int[] nums) {
		int end = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[end] != nums[i]) {
				end++;
				nums[end] = nums[i];
			}
		}
		return end + 1;
	}
}
