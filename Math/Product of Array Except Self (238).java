public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] rec = new int[len];
        rec[0] = 1;
        int val = 1;
        
        for (int i = 1; i < len; i++) {
            rec[i] = rec[i - 1] * nums[i - 1];
        }
        
        for (int i = len - 1; i >= 0; i--) {
            rec[i] *= val;
            val *= nums[i];
        }
        
        return rec;
    }
}