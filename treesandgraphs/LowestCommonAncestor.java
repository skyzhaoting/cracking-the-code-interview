package tressandgraphs;

public class LowestCommonAncestor
{
	/**
	 * 寻找二叉树中最低公共祖先
	 * 注意：判断给定结点是否再树中 错误检查
	 * 如果在左子树中 在左子树中查找
	 * 如果在右子树中 在右子树中查找
	 * 在两边返回 root
	 */
	public boolean hasNode(TreeNode root, TreeNode child)
	{
		if(root == null)
			return false;
		if(root == child)
			return true;
		return hasNode(root.left, child) || hasNode(root.right, child);
	}
	public TreeNode helper(TreeNode root, TreeNode p, TreeNode q)
	{
		if(root == null)
			return null;
		if(p == root || q == root)
			return root;
		if(hasNode(root.left, p) && hasNode(root.left, q))
			return helper(root.left, p, q);
		if(hasNode(root.right, p) && hasNode(root.right, q))
			return helper(root.right, p, q);
		return root;
	}
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
	{
		if(!hasNode(root, p) || !hasNode(root, q))
			return null;
		return helper(root, p, q);
	}
}
