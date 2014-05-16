package linkedList;

public class DeleteNode
{
	/**
	 * 删除单向链表中间的某个结点，假定你只能访问该结点
	 * 将待删除结点的值赋值给后置的结点
	 * 此方法不能删除尾结点
	 */
	public static boolean deleteNode(ListNode delete)
	{
		if(delete == null || delete.next == null)
			return false;
		ListNode next = delete.next;
		delete.val = next.val;
		delete.next = delete.next.next;
		return true;
	}
}
