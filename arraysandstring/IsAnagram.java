package arraysandstrings;

import java.util.Arrays;

public class IsAnagram
{
	/**
	 * 判断两个字符串是否符合异位够词
	 * 两种方法，一种排序，一种统计字符串数量
	 * 考虑字母的大小写和空格
	 */
	public static String sort(String string)
	{
		char[] str = string.toCharArray();
		Arrays.sort(str);
		return new String(str);
	}
	
	public static boolean isAnagram1(String s,String t)
	{
		if (s.length() != t.length())
		{
			return false;
		}
		return sort(s).equals(sort(t));
	}
	
	public static boolean isAnagram2(String s,String t)
	{
		if (s.length() != t.length())
		{
			return false;
		}
		int [] count = new int[256];
		for (int i = 0; i < s.length(); i++)
		{
			count[s.charAt(i)]++;
		}
		for (int i = 0; i < t.length(); i++)
		{
			count[t.charAt(i)]--;
			if(count[t.charAt(i)] < 0)
				return false;
		}
		return true;
	}
}
