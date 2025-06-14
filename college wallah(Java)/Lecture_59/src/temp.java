public class temp {
    public static void main(String[] args) {

        int n =6;
        int x =1;
        int y= 1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<=i;j++) {
                    System.out.print(x + " ");
                    x++;
                }
                System.out.println();
            }
            else{
                y = x + i;
                for(int j=0;j<=i;j++) {
                    System.out.print(y + " ");
                    y--;
                    x++;
                }
                System.out.println();
            }
        }
    }
}
