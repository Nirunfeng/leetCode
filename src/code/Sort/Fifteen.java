package code.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15.三数之和
 */
public class Fifteen {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> ans=new ArrayList<>();
        //获取nums长度
        Integer len=nums.length;
        //判断边界0<=len<3时都没有结果，直接返回ans
        if(len==0||len<3){
            return ans;
        }

        //对nums进行排序
        Arrays.sort(nums);

        //开始循环判断
        for(int i=0;i<len;i++){
            //若当前数字>0，则三数之和必大于0（已经sort过）
            if(nums[i]>0){
                break;
            }
            //若当前数与前一个数相同则跳过（前一个已经判断过）
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int L=i+1;
            int R=len-1;
            while(L<R){
                int sum=nums[i]+nums[L]+nums[R];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (L<R && nums[L] == nums[L+1]) L++; // 去重
                    while (L<R && nums[R] == nums[R-1]) R--; // 去重
                    L++;
                    R--;
                }
                else if (sum < 0) L++;
                else if (sum > 0) R--;
            }
        }
        return ans;
    }
}
