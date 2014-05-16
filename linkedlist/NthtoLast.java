package linkedList;

public class NthtoLast
{
	/**
	 * 找出单链表中倒数第K个结点
	 * tips:注意每一步指针的有效性 
	 */
	public static ListNode nthtoLast(ListNode head, int k)
	{
		if(k <= 0 || head == null)
			return null;
		ListNode slow = head;
		ListNode fast = head;
		for(int i = 0; i < k; i++)
		{
			if(fast == null)
				return null;
			fast = fast.next;
		}
		if(fast == null)
			return head;
		while(fast != null)
		{
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}

}
