package tressandgraphs;

public class IsBalanced
{
	/**
	 * 检查一个二插树是否平衡，平衡的定义是任意结点的左右子树的高度相差不大于1
	 * 此方法时间复杂度是O（n）
	 */
	public static int checkHeight(TreeNode root)
	{
		if(root == null)
			return 0;
		
		int leftHeight = checkHeight(root.left);
		if(leftHeight == -1)
			return -1;
		
		int rightHeight = checkHeight(root.right);
		if(rightHeight == -1)
			return -1;
		
		int heightDiff = Math.abs(leftHeight - rightHeight);
		if(heightDiff > 1)
			return -1;
		else 
		{
			return Math.max(leftHeight, rightHeight)+1;
		}
	}
	public static boolean isbalanced(TreeNode root)
	{
		if(checkHeight(root) == -1)
			return false;
		else return true;
	}
}
