class Solution {
    public int firstMissingPositive(int[] nums) {
        int sol = 1;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                if (nums[i] == sol) {
                    sol++;
                }
                if (nums[i] < nums[i] - 1) {
                    return nums[i] - 1;
                }
            }
        }
        return sol;
    }
}