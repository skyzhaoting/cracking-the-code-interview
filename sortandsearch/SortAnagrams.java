package sortandsearch;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;

public class SortAnagrams
{
	/**
	 * 对字符串数组排序，将所有的变位词排在相邻的位置上
	 * 两种方法
	 * 1改变基本算法的比较器 比较器来表示两个字符串是否是变位词
	 * 2使用哈希表现将变位词放到一起 再放回原来的数组
	 */
	/*调用排序方法 使用Arrays.sort(array,new AnagramComparator()) */
	public class AnagramComparator implements Comparator<String>
	{
		public String sortChars(String s)
		{
			char[] content = s.toCharArray();
			Arrays.sort(content);
			return new String(content);
		}
		
		public int compare(String s1, String s2)
		{
			return sortChars(s1).compareTo(sortChars(s2));
		}
	}
	/*第二种方法 使用 哈希表*/
	public static void sort(String[] array)
	{
		HashMap<String, LinkedList<String>> map = new HashMap<String, LinkedList<String>>();
		for (String s : array)
		{
			char[] keys = s.toCharArray();
			Arrays.sort(keys);
			String key = keys.toString();
			if(!map.containsKey(key))
			{
				map.put(key, new LinkedList<String>());
			}
			LinkedList<String> list = map.get(key);
			list.push(s);
		}
		int index = 0;
		for (String key : map.keySet())
		{
			LinkedList<String> list = map.get(key);
			for (String t : list)
			{
				array[index] = t;
				index++;
			}
		}
	}
}
