package stackandqueue;

import java.util.Stack;
/**
 * 实现一个MyQueue类，该类使用两个栈来实现一个队列
 * stackNewest顶端是最新的元素 stackOldest顶端是最旧的元素
 * 先将stackOldest的元素出列 如果为空 将stackNewest的所有元素反向顺序存到stackOldest中
 * 如果插入元素 将元素插入到stackNewest中
 */

public class MyQueue<T>
{
	Stack<T> stackNewest,stackOldest;
	public MyQueue()
	{
		stackNewest = new Stack<T>();
		stackOldest = new Stack<T>();
	}
	public int size()
	{
		return stackNewest.size() + stackOldest.size();
	}
	public void add(T valueT)
	{
		stackNewest.push(valueT);
	}
	private void shiftStack()
	{
		if (stackOldest.isEmpty())
		{
			while(!stackNewest.isEmpty())
			{
				stackOldest.push(stackNewest.pop());
			}
		}
	}
	public T peek()
	{
		shiftStack();
		return stackOldest.peek();		
	}
	public T remove()
	{
		shiftStack();
		return stackOldest.pop();
	}
}
