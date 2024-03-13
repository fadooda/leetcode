class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0; // Slow pointer to place valid elements

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i]; // Overwrite unwanted values
                index++;
            }
        }
        
        return index; // The new length of the array without `val`
    }
}
