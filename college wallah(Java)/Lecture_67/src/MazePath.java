public class MazePath {
    public static void main(String[] args) {
        int row =4;
        int col =4;
        int count = path(0,0,row-1,col-1);
        System.out.println(count);
    }

    private static int path(int sr, int sc, int er, int ec) {
        if(sr>er || sc > ec) return 0;
        if(sr==er && sc==ec) return 1;
        int downWays = path(sr+1,sc,er,ec);
        int rightWays = path(sr,sc+1,er,ec);
        return downWays + rightWays;
    }
}
