package dp;

public class UniquePaths
{
	/**
	 * 机器人在图的左上角 只能向右 向下移动，到右下角有多少种走法
	 * 与leetcode中的UniquePath题一样 采用动态规划的做法
	 */
    public int uniquePaths(int m, int n) {
        if(m <= 0 || n <= 0)
            return 0;
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++)
            dp[i][0] = 1;
        for(int i = 1; i < n; i++)
            dp[0][i] = 1;
        for(int i = 1; i < m; i++)
        {
            for(int j = 1; j < n; j++)
            {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
