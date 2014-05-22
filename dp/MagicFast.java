package dp;

public class MagicFast
{
	/**
	 * 数组A[0...n-1] 魔术索引满足条件A[i] = i 给定一个有序整数数组，实现一个算法 找出魔术索引
	 * 如果有重复值如何处理
	 */
	public static int magicFast(int[] array)
	{
		return magicFast2(array,0,array.length-1);
	}
	public static int magicFast1(int[] array, int start, int end)
	{
		if(end < start || start < 0 || end >= array.length)
			return -1;
		int mid = (start + end)/2;
		if(array[mid] == mid)
			return mid;
		else if(array[mid] < mid)
			return magicFast1(array, mid+1, end);
		else return magicFast1(array, start, mid-1);
	}
	
	/*加入重复元素后 就不能断定搜索的范围 但是可以排除一部分不可能的值 
	 * 左搜索范围是start到min(mid-1,midValue)
	 * 右搜索范围是max(mid+1,midValue)到end
	 * 找到第一个是魔术索引的值 
	 */
	public static int magicFast2(int[] array, int start, int end)
	{
		if(end < start || start < 0 || end >= array.length)
			return -1;
		int midIndex = (start + end)/2;
		int midValue = array[midIndex];
		if(midValue == midIndex)
			return midIndex;
		
		int leftIndex = Math.min(midIndex-1,midValue);
		int left = magicFast2(array,start,leftIndex);
		if (left >= 0)
		{
			return left;
		}
		
		int rightIndex = Math.max(midValue,midIndex+1);
		int right = magicFast2(array,rightIndex,end);
		
		return right;
	}
}
