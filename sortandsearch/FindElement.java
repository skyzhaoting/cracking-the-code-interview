package sortandsearch;

public class FindElement
{
	/**
	 * 给定一个M*N的矩阵，每一行和每一列都按升序排列 编写代码找出某元素
	 * 列的开头大于X，X在该列左边
	 * 列的末尾小于X，X在该列右边
	 * 行的开头大于X，X在该行的上边
	 * 行的末尾小于X，X在该行的下边
	 */
	public static boolean findElement(int[][] matrix, int elem)
	{
		int row = 0;
		int col = matrix[0].length;
		while(row < matrix.length && col >= 0)
		{
			if (matrix[row][col] == elem)
			{
				return true;
			}
			else if (matrix[row][col] > elem) {
				col--;
			}
			else {
				row++;
			}
		}
		return false;
	}
}
