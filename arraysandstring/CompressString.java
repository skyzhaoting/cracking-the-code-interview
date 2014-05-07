package arraysandstrings;

public class CompressString
{
	/**
	 * 实现字符串的基本压缩功能，aabcccccaaa --->a2b1c5a3
	 * 如果压缩后的字符串没有变短，返回原来的字符串
	 * 使用StringBuilder加快效率
	 */
	public static String compress(String string)
	{
		if (string == null || string.length() == 0)
		{	
			return "";
		}
		StringBuilder sb = new StringBuilder();
		char last = string.charAt(0);
		int count = 1;
		for(int i = 1; i < string.length();i++)
		{
			if(last == string.charAt(i))
			{
				count++;
			}
			else 
			{
				sb.append(last);
				sb.append(count);
				last = string.charAt(i);
				count = 1;
			}
		}
		sb.append(last);
		sb.append(count);
		int len = sb.toString().length();
		return len >= string.length()?string:sb.toString();
	}
}
