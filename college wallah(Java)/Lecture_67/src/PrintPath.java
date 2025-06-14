public class PrintPath {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        path(0,0 ,row-1,col-1,"");
    }
    public static void path(int sr,int sc, int er, int ec,String str){
        if(sr >er || sc > ec) return;
        if(sr == er && sc == ec){
            System.out.println(str);
            return;
        }
        // down
        path(sr+1,sc,er,ec,str+"D ");
        // right
        path(sr,sc+1,er,ec,str+"R ");
    }
}
