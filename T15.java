package leetcode0_50;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ����֮��
 * ��ʱ�临�Ӷ�n(2)->n(2)��
 * @author xx
 *
 */
public class T15 {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		int len = nums.length;
		if(len < 3 || nums==null)return ans;
		Arrays.sort(nums);// O(n log(n)) �����㷨
		for(int i=0;i<len;i++) {
			if(nums[i] > 0)	break;
			if(i > 0 && nums[i]==nums[i-1])continue;//ȥ��
			int L = i + 1;
			int R = len - 1;
			//L��R��������i���ұ�
			while(L < R) {
				int sum = nums[i]+nums[L]+nums[R];
				if(sum == 0) {
					ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
					while(L < R && nums[L]==nums[L+1]) L++;//ȥ��
					while(L < R && nums[R]==nums[R-1]) R--;//ȥ��
					//ͬʱ������С��Χ
					L++;
					R--;
				}
				else if(sum < 0) L++;//ֻ����L
				else if(sum > 0) R--;//֮��СR
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int [] nums = {-1,0,1,2,-1,-4};
		System.out.println(new T15().threeSum(nums));
	}
}
