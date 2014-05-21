package tressandgraphs;

public class SubTree
{
	/**
	 * 判断T2是不是T1的子树
	 * 搜索T1树的每个结点 如果某个结点和T2的跟结点匹配，调用TreeMatch
	 * TreeMatch比较两颗子树，是否相同
	 */
	public boolean containsTree(TreeNode t1, TreeNode t2)
	{
		if(t2 == null)
			return true;
		return subTree(t1,t2);
	}
	public boolean subTree(TreeNode r1, TreeNode r2)
	{
		if (r1 == null)
			return false;
		if(r1.val == r2.val)
		{
			if(matchTree(r1,r2))
				return true;
		}
		return (subTree(r1.left, r2) || subTree(r1.right, r2));
	}
	public boolean matchTree(TreeNode r1, TreeNode r2)
	{
		if(r1 == null && r2 == null)
			return true;
		if(r1 == null || r2 == null || r1.val != r2.val)
			return false;
		return (matchTree(r1.left, r2.left) && matchTree(r1.right, r2.right));
		
	}
}
