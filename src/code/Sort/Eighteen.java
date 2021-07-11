package code.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 题号18.四数之和
 */
public class Eighteen {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int start;
        int end;
        List<List<Integer>> ans = new ArrayList<>();
        //排序数组
        Arrays.sort(nums);
        for(int i=0;i<nums.length-4;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length-3;j++){
                if(j>i+1&&nums[j]==nums[j-1]){
                    continue;
                }

                //双指针设置
                start=j+1;
                end=nums.length-1;
                while(start<end){
                    if(start>j+1&&nums[start]==nums[start-1]){
                        continue;
                    }
                    //计算四数之和
                    if(nums[i]+nums[j]+nums[start]+nums[end]>target){
                        end--;
                    }

                    else if(nums[i]+nums[j]+nums[start]+nums[end]<target){
                        start++;
                    }
                    else{
                        ans.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[j],nums[start],nums[end])));
                        start++;end--;
                    }

                }
            }
        }
        return ans;
        // Arrays.sort(nums);
        // int len = nums.length;
        // List<List<Integer>> res = new ArrayList<List<Integer>>();
        // int c;
        // int d;
        // for(int i = 0; i <= len - 4; i++){
        //     if(i > 0 && nums[i] == nums[i-1]){
        //         continue;
        //     }
        //     for(int j = i + 1; j <= len - 3; j++){
        //         if(j > i + 1 && nums[j] == nums[j-1]){
        //             continue;
        //         }
        //         c = j + 1;
        //         d = len - 1;
        //         while(c < d){
        //             if(c > j + 1 && nums[c] == nums[c-1]){
        //                 c++;
        //                 continue;
        //             }
        //             if(nums[i]+nums[j]+nums[c]+nums[d] > target){
        //                 d--;
        //             }else if(nums[i]+nums[j]+nums[c]+nums[d] < target){
        //                 c++;
        //             }else{
        //                 res.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[j],nums[c],nums[d])));
        //                 c++;
        //                 d--;
        //             }
        //         }
        //     }
        // }


        // return res;

    }
}
