class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array for better binary search efficiency
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length, n = nums2.length;
        int left = 0, right = m, halfLen = (m + n + 1) / 2;

        while (left <= right) {
            int mid1 = (left + right) / 2;  // Partition point in nums1
            int mid2 = halfLen - mid1;      // Partition point in nums2

            // Find left and right partitions
            int maxLeft1 = (mid1 == 0) ? Integer.MIN_VALUE : nums1[mid1 - 1];
            int minRight1 = (mid1 == m) ? Integer.MAX_VALUE : nums1[mid1];

            int maxLeft2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[mid2 - 1];
            int minRight2 = (mid2 == n) ? Integer.MAX_VALUE : nums2[mid2];

            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                // Found the correct partition
                if ((m + n) % 2 == 0) {
                    return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
                } else {
                    return Math.max(maxLeft1, maxLeft2);
                }
            } else if (maxLeft1 > minRight2) {
                right = mid1 - 1;  // Move partition left
            } else {
                left = mid1 + 1;   // Move partition right
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted properly");
    }
}
