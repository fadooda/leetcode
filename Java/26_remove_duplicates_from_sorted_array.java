// Online Javascript Editor for free
// Write, Edit and Run your Javascript code using JS Online Compiler
//let numlis=[1,2]

/**
 * @param {number[]} nums
 * @return {number}
 */
function removeDuplicates(nums) {
  if (nums.length === 0) return 0;

  // i is the index of the last unique element
  let i = 0;
  for (let j = 1; j < nums.length; j++) {
    // When we find a new unique element,
    // increment i and update nums[i]
    if (nums[j] !== nums[i]) {
      i++;
      nums[i] = nums[j];
    }
  }
  // The number of unique elements is i + 1
  return i + 1;
}