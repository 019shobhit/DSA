package Lecture11;

public class Main {
    static void main() {
        int n =5;

        for(int i=0;i<n;i++) {
            for (int j = 1; j <=n*2-1; j++) {
                if((j==n-i) || j==n+i|| i==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(

            );
        }


//        for(int i=0;i<n;i++){
//            for(int j=0;j<i;j++){
//                System.out.print("  ");
//            }
//            for(int j = 0; j <(n- i)*2-1; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}
