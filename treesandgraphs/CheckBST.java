package tressandgraphs;

public class CheckBST
{
	/**
	 * 检查一棵二叉树是不是二叉查找树
	 * 二中方法：
	 * 第一种是中序遍历存在一个数组当中，然后判断数组是否升序，但是不能判断有重复值的树
	 * 第二种叫做最小/最大值方法，利用最小最大值的范围来确定树的有效性 
	 * left.data <= current.data < rigth.data
	 */
	public boolean checkBST(TreeNode root)
	{
		return checkBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	public boolean checkBST(TreeNode root, int min, int max)
	{
		if(root == null)
			return true;
		if (!checkBST(root.left,min,root.val))
			return false;
		if(root.val < min || root.val >= max)
			return false;
		if(!checkBST(root.right, root.val, max))
			return false;
		return true;
	}
}
