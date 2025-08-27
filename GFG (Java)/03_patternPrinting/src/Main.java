public class Main {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.printf("%d ",j);
            }
            for (int j = 1; j <=n-i; j++) {
                System.out.printf("%d ",i);
            }
            for(int j = 1 ;j<=n-i;j++){
                System.out.printf("%d ",i);
            }
            for(int j = 1 ; j<i;j++){
                    System.out.printf("%d ",i-j);
            }
            System.out.println("");
        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <=i; j++) {
//                System.out.printf("  ");
//            }
//            for (int j = 0; j < (n-i-1)*2-1; j++) {
//                System.out.printf("* ");
//            }
//            System.out.println("");
//        }
    }
}