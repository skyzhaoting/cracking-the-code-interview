package dp;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetsII
{
	/**
	 * 集合中可能包含重复的数字 返回的子集中无重复的子集
	 * 添加一条语句即可 如果数字重复就跳过
	 */
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
        ArrayList<ArrayList<Integer>> res = new  ArrayList<ArrayList<Integer>>();
	    if(num == null || num.length == 0)
	       return res;
	    Arrays.sort(num);
	    helper(num,0,new ArrayList<Integer>(),res);
	    return res;
	}
	private static void helper(int num[], int index, ArrayList<Integer> item, ArrayList<ArrayList<Integer>> res) {
		res.add(new ArrayList<Integer>(item));
		for(int i = index; i < num.length; i++)
		{
			if(i != index && num[i]==num[i-1]) /*添加语句 判断数字是否重复 注意不能越界 i!=index确保i-1不越界*/
				continue; 
			item.add(num[i]);
			helper(num, i+1, item, res);
			item.remove(item.size()-1);
		}
	}

}
