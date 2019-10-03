package leetcode0_50;


import java.util.Arrays;

/**
 * Ѱ�������������λ��
 * Ҫ��O(log(m+n))
 * һ�㿴��log �������Ƕ��ַ�
 * @author xx
 * 
 */
public class T4 {
	public double findMedian(int[] nums) {
		int len = nums.length;
		if(len==0)return 0;
		if(len%2==0)
			return (nums[len/2-1]+nums[len/2])/2.0; 
		else 
			return nums[len/2];
	}
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		
		if(nums1.length==0 && nums2.length==0)return 0;
		if(nums1.length==0)return findMedian(nums2);	
		if(nums2.length==0)return findMedian(nums1);
		//�ϲ�������������
		int []nums3 = new int[nums1.length+nums2.length]; 
		System.arraycopy(nums1, 0, nums3, 0, nums1.length);
		System.arraycopy(nums2, 0, nums3, nums1.length, nums2.length); 
		Arrays.sort(nums3);//����
		return findMedian(nums3);

	}
	public static void main	( String[] args) {
		int [] nums1 = {7,8,9};
		int [] nums2 = {1,2,3,4};
		System.out.print(new T4().findMedianSortedArrays(nums1, nums2));
	}
}
