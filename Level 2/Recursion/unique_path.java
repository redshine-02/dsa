public class unique_path {
    public boolean inRange(int r , int c , int m , int n ){
        if(r<0 || c<0 || r>=m || c>=n){
            return false;
        }
        return true;
    }
    public int ways(int sr , int sc , int dr , int dc ,int[][] dp , int[][] dir){
        if(sr == dr && sc == dc){
            return dp[sr][sc]=1;
        }
        if(dp[sr][sc]!=0){
            return dp[sr][sc];
        }
        int count = 0 ;
        for(int d = 0 ; d<dir.length ; d++){
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
            if(inRange(r,c,dr+1,dc+1)){
                count+=ways(r,c,dr,dc,dp,dir);
            }
        }
        return dp[sr][sc]=count;
    }
    
    public int uniquePaths(int m, int n) {
        int[][] dir = {{0,1},{1,0}};
        int[][] dp = new int[m][n];
        int ans = ways(0,0,m-1,n-1,dp,dir);
        return ans;
    }
}
