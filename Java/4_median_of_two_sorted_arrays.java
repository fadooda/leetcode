class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int[] newArr = new int[nums1.length + nums2.length];
    System.arraycopy(nums1, 0, newArr, 0, nums1.length);
    System.arraycopy(nums2, 0, newArr, nums1.length, nums2.length);
    Arrays.sort(newArr);
    int medianIndex = 0;
    double medianNum = 0.0d;
    medianIndex = newArr.length / 2;
    if(newArr.length % 2 == 0) {
       medianNum = (newArr[medianIndex] + newArr[medianIndex - 1]) / 2.0;
    } else {
        medianNum = newArr[medianIndex];
    }
    
    return medianNum;
}
}