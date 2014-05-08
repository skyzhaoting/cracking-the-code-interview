package arraysandstrings;


public class SetMatrixZeroes
{
	/**
	 * 扫描两遍 第一遍扫描使用行数组和列数组记录出现0的行和列
	 * 第二遍置0
	 */
	public static void setMatrixZeroes(int[][] matrix)
	{
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
			return;
		boolean[] row = new boolean[matrix.length];
		boolean[] col = new boolean[matrix[0].length];
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[0].length; j++)
			{
				if(matrix[i][j] == 0)
				{
					row[i] = true;
					col[j] = true;
				}
			}
		}
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[0].length; j++)
			{
				if(row[i] || col[j])
				{
					matrix[i][j] = 0;
				}
			}
		}
	}
}
