package linkedList;

public class DeleteDups
{
	/**
	 * 删除未排序链表中的重复结点 不使用临时缓冲区
	 * 哈希表O(N) 快行指针 O（N^2）不使用临时缓冲区
	 */
	public static void deleteDups(ListNode head)
	{
		if(head == null)
			return;
		ListNode cur = head;
		while(cur != null)
		{
			ListNode run = cur;
			while(run.next != null)
			{
				if(run.next.val == cur.val)
					run.next = run.next.next;
				else {
					run = run.next;
				}
			}
			cur = cur.next;
		}
	}
}
