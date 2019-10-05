package leetcode0_50;
/**
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素最多出现两次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * @author xx
 *
 */
public class T80 {
	 public int removeDuplicates(int[] nums) {
	        if(nums == null)
	            return 0;
	        if(nums.length <= 2)
	            return nums.length;
	        int i=1,j=2;
	        while(j<nums.length){
	            //间隔为2进行判断
	            if(nums[i-1]==nums[j]){
	                j++;
	            }else{
	                nums[++i] = nums[j++];
	            }
	        }
	        return i+1;
	    }
}
