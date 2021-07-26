package code.Arrays;

/**
 * TODO
 *
 * @author Ni runfeng
 * @description 题号27.移除元素代码
 * @email 2570034697@qq.com
 * @date 2021/7/26 22:11
 */
public class Twenty_seven {
    public int removeElement(int[] nums, int val) {
        //设置下标，返回结果
        int ans=0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]!=val){
                nums[ans]=nums[i];
                ans++;
            }
        }
        return ans;
    }
}
