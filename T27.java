package leetcode0_50;

/**
 * 去除数组元素，返回数组长度
 * O(1)空间复杂度
 * @author xx
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 */
public class T27 {
	public int removeElement(int[] nums, int val) {
		int i=0;
		for(int j=0;j<nums.length;j++) {
			if(nums[j]!=val) {
				nums[i]=nums[j];
				i++;
			}
		}
		return i;
	}
	public static void main(String[] args) {
		int [] nums = {1,2,3,3,4,5,6};
		System.out.println(new T27().removeElement(nums, 3));
	}
}
