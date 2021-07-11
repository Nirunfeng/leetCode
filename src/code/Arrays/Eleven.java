package code.Arrays;

/**
 * 题号11.盛最多水的容器
 */
public class Eleven {
    public int maxArea(int[] height) {
       int i=0;
       int j=height.length-1;
       int ans=0;

       //判断循环
        while (i<j){//循环条件1
            //循环条件2
            if(height[i]<height[j]){
                ans=Math.max(ans,(j-i)*height[i]);
                i++;
            }else {
                ans=Math.max(ans,(j-i)*height[j]);
                j--;
            }
        }
        return ans;
    }
}
