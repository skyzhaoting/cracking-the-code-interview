package dp;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsets
{
	/**
	 * 返回某个集合的所有子集 和leetcode中的subsets一样
	 * 子集升序 所以先对给的结合排序
	 * 两种方法 第一种是迭代的方法 在每次迭代的集合中的子集后面加上新的元素
	 * 第二种是递归
	 */
    public ArrayList<ArrayList<Integer>> subsets1(int[] S) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        res.add(new ArrayList<Integer>());
        if(S == null || S.length == 0)
            return res;
        Arrays.sort(S);
        for(int i = 0; i < S.length; i++)
        {
            int size = res.size();
            for(int j = 0; j < size; j++)
            {
                ArrayList<Integer> item = new ArrayList<Integer>(res.get(j));
                item.add(S[i]);
                res.add(item);
            }
        }
        return res;
    }
    public ArrayList<ArrayList<Integer>> subsets2(int[] S) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(S == null || S.length == 0)
            return res;
        Arrays.sort(S);
        helper(S,0,new ArrayList<Integer>(),res);
        return res;
    }
    public void helper(int[] S, int index, ArrayList<Integer> item, ArrayList<ArrayList<Integer>> res)
    {
        res.add(new ArrayList<Integer>(item));/*注意添加的时候new一个新对象出来*/
        for(int i = index; i < S.length; i++)
        {
            item.add(S[i]);
            helper(S,i+1,item,res);
            item.remove(item.size()-1);
        }
    }
}
