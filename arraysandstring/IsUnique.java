package arraysandstrings;

public class IsUnique
{
	/**
	 * 判断一个字符串的所有字符是否相同
	 * 时间复杂度O(n),O(1)
	 * @param string
	 * @return true or false
	 */
	public static boolean isUnique(String string) 
	{
		if(string.length() > 256)
			return false;
		boolean[] checker = new boolean[256];
		for (int i = 0; i < string.length(); i++)
		{
			if (checker[string.charAt(i)])
			{
				return false;
			}
			else 
			{
				checker[string.charAt(i)] = true;
			}
		}
		return true;
	}
}
