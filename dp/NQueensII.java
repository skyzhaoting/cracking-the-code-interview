package dp;

import java.util.ArrayList;

public class NQueensII
{
	/**
	 * 返回N皇后问题的解法数量
	 */
	public int totalNQueens(int n) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        res.add(0);
        helper(n,0,new int[n],res);
        return res.get(0);
    }
    public void helper(int n, int row, int[] col, ArrayList<Integer> res)
    {
        if(row == n)
        {
            res.set(0,res.get(0)+1);
            return;
        }
        else
        {
            for(int i = 0; i < n; i++)
            {
                col[row] = i;
                if(check(row,col))
                {
                    helper(n,row+1,col,res);
                }
            }
        }
    }
    public boolean check(int row, int[] col)
    {
        for(int i = 0; i < row; i++)
        {
            if(col[row] == col[i] || Math.abs(col[row] - col[i]) == Math.abs(row - i))
                return false;
        }
        return true;
    }
}
