public class Solution {
    public int removeElement(int[] nums, int val) {
        int newLength = 0;
        for (int num : nums) {
            if (num != val) {
                nums[newLength++] = num;
            }
        }
        return newLength;
    }
    public static void main(String args[]){
        int[] nums = {1, 2, 3, 4};
        int val = 2;
        Solution solution = new Solution();
        int newLength = solution.removeElement(nums, val);
    }
}
