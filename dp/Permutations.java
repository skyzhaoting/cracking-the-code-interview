package dp;

import java.util.ArrayList;

public class Permutations
{
	/**
	 * 返回数字结合的全排列
	 * 递归的思想 使用used的布尔数组来标记该元素是否已在当前结果中
	 * 每次取一个元素放在结果中，递归剩下的元素
	 */
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(num.length == 0)
            return res;
        getPermute(num,new boolean[num.length],new ArrayList<Integer>(),res);
        return res;
    }
    public void getPermute(int[] num, boolean[] used, ArrayList<Integer> item, ArrayList<ArrayList<Integer>> res)
    {
        if(item.size() == num.length)
        {
            res.add(new ArrayList<Integer>(item));
            return;
        }
        for(int i = 0; i < num.length; i++)
        {
            if(!used[i])
            {
                used[i] = true;
                item.add(num[i]);
                getPermute(num,used,item,res);
                item.remove(item.size()-1); /*恢复现场 递归函数保证进入和离开时变量的状态是一致的*/
                used[i] =false;
            }
        }
    }
}
