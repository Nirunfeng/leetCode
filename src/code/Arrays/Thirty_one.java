package code.Arrays;

/**
 * TODO
 *
 * @author Ni runfeng
 * @description 题号31.下一个排列
 * @email 2570034697@qq.com
 * @date 2021/8/9 22:11
 */
public class Thirty_one {

    public void nextPermutation(int[] nums) {
        int N = nums.length,lo=0,hi=0;
        for(int i=N-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                lo=i-1;
                break;
            }
        }
        for(int j=N-1;j>lo;j--){
            if(nums[j]>nums[lo]) {
                hi = j;
                break;
            }
        }
        if(lo == 0 && hi == 0){
            hi=N-1;
            while(lo<hi){
                swap(nums,lo,hi);
                ++lo;
                --hi;
            }
        }
        else{
            swap(nums,lo,hi);
            hi=N-1;
            while(lo+1<hi){
                swap(nums,lo+1,hi);
                ++lo;
                --hi;
            }
        }
    }
    public void swap(int[] nums,int i,int j){
        int sto = nums[i];
        nums[i] = nums[j];
        nums[j] = sto;
    }

}
