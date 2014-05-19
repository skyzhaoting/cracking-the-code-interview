package stackandqueue;

import java.util.Stack;

public class Stacksort
{
	/**
	 * 按升序对栈进行排序（最大元素位于栈顶） 最多只能使用一个额外的栈
	 * 不能将元素复制到别的数据结构中
	 * 原来栈存放为排序的 新栈存放排好序的 
	 */
	public static Stack<Integer> stacksort(Stack<Integer> s)
	{
		Stack<Integer> r = new Stack<Integer>();
		while(!s.isEmpty())
		{
			int tmp = s.pop();
			while(!r.isEmpty() && r.peek() > tmp)
			{
				s.push(r.pop());
			}
			r.push(tmp);
		}
		return r;
	}
}
