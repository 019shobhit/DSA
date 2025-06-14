public class AllDirectionMazePath {
    public static void main(String[] args) {
        int row =3;
        int col =3;
        boolean[][] isVisited = new boolean[row][col];
        path(0,0,row-1,col-1,"",isVisited);
    }

    private static void path(int sr, int sc, int er, int ec, String str, boolean[][] isVisited) {
        if(sr<0 || sc<0) return;
        if(sr > er || sc > ec) return;
        if(isVisited[sr][sc]) return;
        if(sr == er && sc == ec) {
            System.out.println(str);
            return;
        }
        isVisited[sr][sc] = true;
        //left
        path(sr,sc-1,er,ec,str+"L ",isVisited);
        //right
        path(sr,sc+1,er,ec,str+"R ",isVisited);
        //down
        path(sr+1,sc,er,ec,str+"D ",isVisited);
        //up
        path(sr-1,sc,er,ec,str+"U ",isVisited);
        isVisited[sr][sc] = false;
    }
}
