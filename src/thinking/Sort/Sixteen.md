# 题号16.最接近的三数之和

## 题目描述

给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。

## 示例
```
输入：nums = [-1,2,1,-4], target = 1
输出：2
解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
```
## 解题思路
通过将数组排序，然后通过双指针进行访问.通过循环i=0；i<nums.length-2;i++对数组进行遍历。

指针设置：
- start=i+1；end=nums.length-1


- sum=nums[i]+nums[start]+nums[end];

-  | abs(差值)|=target-sum。

- 当abs最小时，返回sum

指针偏移条件：

- sum>target情况：
        因为nums已经sort过，nums[i]<nums[start]<nums[end]，此时我们需要寻找较小的共加数，所以尾指针向内缩进end--;
- sum>target情况：
        因为nums已经sort过，nums[i]<nums[start]<nums[end]，此时我们需要寻找较大的共加数，所以头指针向内缩进start++;
