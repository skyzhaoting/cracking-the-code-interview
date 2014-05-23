package dp;

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationsII
{
	/**
	 * 集合中有重复的数字
	 * 与Permutations的区别是 先将集合排序，再遇到重复元素跳过
	 */
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(num.length == 0)
            return res;
        Arrays.sort(num);                 /*排序*/
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
            if(i > 0 && used[i-1] && num[i-1] == num[i]) /*添加判断语句，遇到重复元素跳过递归函数*/
                continue;
            if(!used[i])
            {
                used[i] = true;
                item.add(num[i]);
                getPermute(num,used,item,res);
                item.remove(item.size()-1);
                used[i] = false;
            }
        }
    }
}
