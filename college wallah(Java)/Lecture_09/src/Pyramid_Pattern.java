//            *
//           ***
//          *****
//         *******
//        *********
public class Pyramid_Pattern {
    public static void main(String[] args) {
//        int i,j;
//        for(i=1;i<=5;i++){
//            for(j=1;j<=5-i;j++){
//                System.out.print(" ");
//            }
//            for(;j<5+i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
