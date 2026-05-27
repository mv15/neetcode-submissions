class Solution {
    public int[] getConcatenation(int[] nums) {
        
        
        int length = nums.length;
        int[] ans = new int[2*length];
        for (int i = 0; i < 2*length; i++) {
            ans[i] = nums[i % length];
        }

        return ans;
    }
}