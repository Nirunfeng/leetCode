# 题号18.四数之和

## 题目描述

给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。

注意：答案中不可以包含重复的四元组。

# 示例
示例1：
```
输入：nums = [1,0,-1,0,-2,2], target = 0
输出：[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
```
示例2：
```
输入：nums = [], target = 0
输出：[]
```
## 解题思路

参考三数之和的双指针法，再该问题中可设置两组循环，固定在每次循环时固定前两位，采用双指针法遍历头尾。

解题步骤：
```
- 排序数组：Arrays.sort
- 临界判断：
        数组长度小于4，return
- 第一重循环i：
        去除第一个数重复的情况，nums[i]=nums[i+1];continue
- 第二重循环j：
        去除第二个数重复的情况，nums[j]=nums[j+1];continue
- 双指针设置：
        start=j+1;end=nums.length-1;
- sum=nums[i]+nums[j]+nums[start]+nums[end]
- 指针偏移判断：
        sum>target: end--
        sum<target:start++
```
