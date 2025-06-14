public class Pyramid_Border_Numeric {
    public static void main(String[] args) {
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=5-i;j++){
//                System.out.print(" ");
//            }
//            for (int k=1;k<=(i*2)-1;k++){
//                if(i==1 || k==1 ||i==5 || k== (i*2)-1) {
//                    System.out.print(i);
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
        int n =5;
        for(int i=0;i<n;i++){
            for(int j =0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j =0;j<(i*2)+1;j++){
                if(j==0 || j==(i*2)||i==n-1 ){
                    System.out.print(i+1);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
