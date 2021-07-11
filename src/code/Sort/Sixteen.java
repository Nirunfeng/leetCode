package code.Sort;

import java.util.Arrays;

/**
 * 题号16.最接近的三数之和
 */
public class Sixteen {
    public int threeSumClosest(int[] nums, int target) {
        //排序数组
        Arrays.sort(nums);
        int len=nums.length;
        int res=nums[0]+nums[1]+nums[2];
        int sum=0;
        for(int i=0;i<len-2;i++){
            int start=i+1;
            int end=len-1;
            while(start<end){
                sum=nums[i]+nums[start]+nums[end];
                //判断差值大小，取小者，将sum赋值给res
                if(Math.abs(target-sum)<Math.abs(target-res))
                    res=sum;
                if(sum>target)
                    end--;
                else if(sum<target)
                    start++;
                else
                    return res;
            }
        }
        return res;

    }
}
