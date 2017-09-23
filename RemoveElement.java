/**
* 从数组中移除指定元素
*/
public class RemoveElement {
	public int removeElement(int[] nums, int val) {
        int length = nums.length;
		if (length == 0)
			return 0;
		// 1.对目标数组进行排序
		sort(nums);

		// 2.找出目标数字的开始位置和个数(count)
		int startIdx = -1;
		int endIdx = -1;
		for (int i = 0; i < length; i++) {
			if (nums[i] == val) {
				if (startIdx == -1) {
					// 记录开始位置
					startIdx = i;
				}
				endIdx = i;
			} else if (startIdx != -1) {
				break;
			}
		}
		if (endIdx + startIdx < 0)
			return nums.length;

		int count = endIdx - startIdx + 1;
		if (endIdx == length - 1) {
			return length - count;
		}

		// 3.将最后一个目标后方元素向前移动个数(count)个位置
		for (int i = endIdx + 1; i < length; i++) {
			int target = i - 1;
			for (int j = 0; j < count; j++) {
				nums[target] = nums[i];
				target--;
			}
		}
		return length - count;
    }
    
    /**
    * 排序
    */
    private void sort(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			int key = nums[i];
			int j = i - 1;
			while (j >= 0 && nums[j] > key) {
				nums[j + 1] = nums[j];
				j--;
			}
			nums[j + 1] = key;
		}
	}
}
