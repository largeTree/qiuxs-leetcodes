public class TowSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        boolean isFinished = false;
        for(int i =0;i<nums.length && !isFinished;i++) {
            res[0] = i;
            int cur = nums[i];
            int curDiff = target - cur;
            for(int j = i + 1;j<nums.length;j++) {
                if(curDiff == nums[j]) {
                    res[1] = j;
                    isFinished = true;
                }
            }
        }
        return res;
    }
}
