public class temp {
    public static void main(String[] args) {
        int n =8;
//              * * * * * * *
//              *           *
//              *   * * *   *
//              *   *   *   *
//              *   * * *   *
//              *           *
//              * * * * * * *


//        (i >= 2 && i <= n - 3 && (i == j || i + j == n - 1))
        n/=2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || i==n-1 || j==0 || j==n-1) {
                    System.out.print(" *");
                } else if (i%2==1) {
                    
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
        
        
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                // Print '*' at the borders and along the diagonals of the inner square
//                if (i==0 || i==n-1 || j==0 || j==n-1) {
//                    System.out.print(" *");
//                } 
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
    }
}
