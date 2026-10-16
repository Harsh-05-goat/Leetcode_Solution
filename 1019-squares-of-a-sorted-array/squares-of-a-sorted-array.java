class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int start = 0;
        int end = n - 1;
        int index = n - 1;

        while (start <= end) {
            int left = nums[start] * nums[start];
            int right = nums[end] * nums[end];
            if (left > right) {
                ans[index] = left;
                start++;
            } else {
                ans[index] = right;
                end--;
            }
            index--;
        }
        return ans;
    }
}