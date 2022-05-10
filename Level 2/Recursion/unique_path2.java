public class unique_path2 {
    public boolean inRange(int r , int c , int m , int n , int[][] obstacleGrid ){
        if(r<0 || c<0 || r>=m || c>=n || obstacleGrid[r][c] ==1){
            return false;
        }
        return true;
    }
    public int ways(int sr , int sc , int dr , int dc ,int[][] dp , int[][] dir, int[][] obstacleGrid){
        if(sr == dr && sc == dc ){
            return dp[sr][sc]=1;
        }
        if(dp[sr][sc]!=0){
            return dp[sr][sc];
        }
        int count = 0 ;
        obstacleGrid[sr][sc] = 1;
        for(int d = 0 ; d<dir.length ; d++){
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
            if(inRange(r,c,dr+1,dc+1,obstacleGrid)){
                count+=ways(r,c,dr,dc,dp,dir,obstacleGrid);
            }
        }
        obstacleGrid[sr][sc] = 0;
        return dp[sr][sc]=count;
    }
    
   
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(n==0 && m==0){
            return 0;
        }
        if(obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1){
            return 0;
        }
        int[][] dir = {{0,1},{1,0}};
        int[][] dp = new int[m][n];
        int ans = ways(0,0,m-1,n-1,dp,dir,obstacleGrid);
        return ans;
    }
}