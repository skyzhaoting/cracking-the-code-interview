package dp;

import java.util.ArrayList;

public class GenerateParentheses
{
	/**
	 * n对括号的有效组合
	 */
    public ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<String>();
        if(n <= 0)
            return res;
        helper(n,n,new String(),res);
        return res;
    }
    private void helper(int left, int right, String item, ArrayList<String> res)
    {
        if(left == 0 && right == 0)
        {
            res.add(item);
        }
        if(left > 0)
            helper(left-1,right,item+"(",res);
        if(right > left)
            helper(left,right-1,item+")",res);
    }
}
