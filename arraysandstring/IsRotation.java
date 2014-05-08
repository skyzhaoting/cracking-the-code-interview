package arraysandstrings;



public class IsRotation
{
	/**
	 * 给点两个字符串 s1 s2 判断s2是不是为s1旋转而来
	 * 将字符串s1 -- > s1s1 判断s2是不是s1的子串
	 */
	public static boolean isRotation(String s1,String s2)
	{
		if(s1.length() == s2.length() && s1.length() > 0)
		{
			String ss = s1 + s1;
			return ss.contains(s2);
		}
		return false;
	}
	
	
}
