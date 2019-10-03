package leetcode0_50;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 * 从时间复杂度n(2)->n(2)降
 * @author xx
 *
 */
public class T15 {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		int len = nums.length;
		if(len < 3 || nums==null)return ans;
		Arrays.sort(nums);// O(n log(n)) 排序算法
		for(int i=0;i<len;i++) {
			if(nums[i] > 0)	break;
			if(i > 0 && nums[i]==nums[i-1])continue;//去重
			int L = i + 1;
			int R = len - 1;
			//L和R都设置在i的右边
			while(L < R) {
				int sum = nums[i]+nums[L]+nums[R];
				if(sum == 0) {
					ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
					while(L < R && nums[L]==nums[L+1]) L++;//去重
					while(L < R && nums[R]==nums[R-1]) R--;//去重
					//同时继续缩小范围
					L++;
					R--;
				}
				else if(sum < 0) L++;//只增大L
				else if(sum > 0) R--;//之缩小R
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int [] nums = {-1,0,1,2,-1,-4};
		System.out.println(new T15().threeSum(nums));
	}
}
