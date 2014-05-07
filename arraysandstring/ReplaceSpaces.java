package arraysandstrings;

public class ReplaceSpaces
{
	/**
	 * 替换字符串中的空格为'%20',字符串的尾部有足够的空间，知道字符串真实的长度
	 * 两遍循环 第一遍求出空格的个数，求出字符串最终的长度，第二遍从尾部编辑字符串
	 */
	public static void replaceSpaces(char[] str, int length)
	{
		int spacecount = 0,newlengh,i;
		for (i = 0;  i < length; i++)
		{
			if (str[i] == ' ')
			{
				spacecount++;
			}
		}
		newlengh = length + spacecount * 2;
		for(i = length - 1; i >= 0; i--)
		{
			if (str[i] == ' ')
			{
				str[newlengh-1] = '0';
				str[newlengh-2] = '2';
				str[newlengh-3] = '%';
				newlengh -= 3;
			}
			else 
			{
				str[newlengh-1] = str[i];
				newlengh--;
			}
		}
	}
}
