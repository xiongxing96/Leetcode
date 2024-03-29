package leetcode0_50;

/**
 * 你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 使元数组的前面排列按照去重后的排列输出
 * O(1)
 * @author xx
 *
 */
public class T26 {
	 public int removeDuplicates(int[] nums) {
		 if(nums == null)return 0;
		 if(nums.length == 1) 
			 return nums.length;
		 //双指针法
		 int i=0,j=1;
		 while(j<nums.length) {
			 if(nums[i] == nums[j]) {
				 j++;
			 }else {
				 i++;
				 nums[i]=nums[j];
				 j++;
				 //直接用nums[++i]=nums[j++];
			 }
		 }
		 return i+1;
	 }
	 public static void main(String []args) {
		 int []nums =  {0,0,1,1,1,2,2,3,3,4};
		 int len = 0;
		 System.out.println( len = new T26().removeDuplicates(nums));
		 for(int i=0;i<len;i++ ) {System.out.print(nums[i]);}
	 }
}
