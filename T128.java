package leetcode100_200;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * ���������
 * ʱ�临�Ӷ�ΪO(n)
 * @author xx
 *
 */
public class T128 {
	//һ��������On(3)
/*
	public boolean arrayContains(int []arr, int num) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == num)
				return true;
		}
		return false;
	}
	public int longestConsecutive(int [] nums) {
		int longestStreak = 0;
		for(int num : nums) {
			int currentNum = num;
			int currentStreak = 1;
			while(arrayContains(nums, currentNum+1)) {
				currentNum++;
				currentStreak++;
			}
			longestStreak = Math.max(longestStreak, currentStreak);
		}
		return longestStreak;
	}
	 public static void main(String[] args) {
		 int [] nums = {100, 4, 200, 1, 3, 2};
		System.out.print(new T128().longestConsecutive(nums));
	}
*/
	//��������O(nlogn)
/*	public int longestConsecutive(int []nums) {
		if (nums.length == 0) 
			return 0;
	        Arrays.sort(nums);//O(nlogn)

	        int longestStreak = 1;
	        int currentStreak = 1;

	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] != nums[i-1]) {
	                if (nums[i] == nums[i-1]+1) {
	                    currentStreak += 1;
	                }
	                else {
	                    longestStreak = Math.max(longestStreak, currentStreak);
	                    currentStreak = 1;
	                }
	            }
	        }
	        return Math.max(longestStreak, currentStreak);
	    }
*/
	//������ϣ������Կռ�Ĺ���
	public int longestConsecutive(int[] nums){
		Set<Integer> num_set = new HashSet<Integer>();
		for(int num:nums) {
			num_set.add(num);	
		}
		int longestStreak = 0;
		for(int num:num_set) {
			if(!num_set.contains(num-1)) {
				int currentNum = num;
				int currentStreak = 1;
				
				while(num_set.contains(currentNum+1)) {
					currentNum++;
					currentStreak++;
				}
				longestStreak = Math.max(longestStreak, currentStreak);
			}
		}
		return longestStreak;
	}
	public static void main(String[] args) {
		 int [] nums = {0,0,-1};
		System.out.print(new T128().longestConsecutive(nums));
	}
}
