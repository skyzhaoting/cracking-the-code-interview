package tressandgraphs;

public class InorderNext
{
	/**
	 * 找出二叉树中某一个结点按中序遍历的下一个结点
	 * 每个结点包含父结点 注意空结点
	 * 如果当前结点的右子树不空 下一个结点是右子树的最左结点
	 * 如果右子树空 当前结点是在其父结点的左边 返回父结点 再其父结点的右边 返回父结点的父结点
	 */
	public TreeNode inorderNext(TreeNode root)
	{
		if(root == null)
			return null;
		if(root.right != null)
			return leftMostRight(root.right);
		else {
			TreeNode q = root;
			TreeNode p = root.parent;
			while (p != null && p.left != q)
			{
				q = p;
				p = p.parent;
			}
			return p;
		}
	}
	public TreeNode leftMostRight(TreeNode root)
	{
		if(root == null)
			return null;
		while (root.left != null)
		{
			root = root.left;
		}
		return root;
	}
}
