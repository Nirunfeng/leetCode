package code.Arrays;

public class Four {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int total = len1 + len2;
        //如果A数组长度+B数组长度total是奇数，则找total/2+1小的元素即为中位数
        if(total % 2 == 1) {
            int midIndex = total / 2 + 1;
            return getKthElement(nums1, nums2, midIndex);
        }
        //否则，找total/2，total/2+1这两个元素
        else {
            int midIndex_1 = total / 2;
            int midIndex_2 = total / 2 + 1;
            double a = getKthElement(nums1, nums2, midIndex_1);
            double b = getKthElement(nums1, nums2, midIndex_2);
            return (a + b) / 2.0D;
        }
    }

    private int getKthElement(int[] nums1, int[] nums2, int k) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int index1 = 0;
        int index2 = 0;
        while(true) {
            //边界情况，当index1越界时，直接返回nums2的第k小元素
            if(index1 == len1) {
                return nums2[index2 + k - 1];
            }
            //边界情况，当index2越界时，直接返回nums1的第k小元素
            if(index2 == len2) {
                return nums1[index1 + k - 1];
            }
            //边界情况，k等于1时，返回nums1第一个元素和nums2第一个元素较小者
            if(k == 1) {
                return Math.min(nums1[index1], nums2[index2]);
            }
            int half = k / 2;
            int newIndex1 = Math.min(index1 + half, len1) - 1;
            int newIndex2 = Math.min(index2 + half, len2) - 1;
            int pivot1 = nums1[newIndex1];
            int pivot2 = nums2[newIndex2];
            //比较nums1[k/2-1]和nums2[k/2-1]
            //如果nums1的小，则忽略掉nums1[0] - nums1[k/2-1]这些元素
            //再更新 k，k 要减去忽略掉的那些元素，index1也要更新，待下轮使用
            if(pivot1 <= pivot2) {
                k -= (newIndex1 - index1 + 1);
                index1 = newIndex1 + 1;
            }
            //如果nums2的小，则忽略掉nums2[0] - nums2[k/2-1]这些元素
            //再更新 k，k 要减去忽略掉的那些元素，index2也要更新，待下轮使用
            else {
                k -= (newIndex2 - index2 + 1);
                index2 = newIndex2 + 1;
            }
        }
    }
}
