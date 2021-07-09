package code.Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * 题号1.两数之和
 */
public class One {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                ans[0]=i;
                ans[1]=map.get(target-nums[i]);
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}
