package leetcode.medianOfTwoArrays;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* CHALLENGE
Given two sorted arrays nums1 and nums2 of size m and n respectively,
return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

Constraints:
- nums1.length == m
- nums2.length == n
- 0 <= m <= 1000
- 0 <= n <= 1000
- 1 <= m + n <= 2000
- -106 <= nums1[i], nums2[i] <= 106
*/
public class Main {
    public static void main(String[] args) {
        int[] nums1 = new int[] {1, 2};
        int[] nums2 = new int[] {3, 4};

        System.out.println("Median: " + findMedianSortedArrays(nums1, nums2));;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a1 = nums1.length;
        int b1 = nums2.length;
        int c1 = a1 + b1;

        int[] merged = new int[c1];
        System.arraycopy(nums1, 0, merged, 0, a1);
        System.arraycopy(nums2, 0, merged, a1, b1);

        Arrays.sort(merged);

        double median;

        if(merged.length % 2 != 0) {
            median = merged[merged.length/2];
        } else {
            double n = merged[merged.length/2];
            double n2 = merged[merged.length/2 - 1];

            median = (n + n2) / 2;
        }

        return median;
    }
}
