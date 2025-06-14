//            1
//           121
//          12321
//         1234321
//        123454321
public class Number_pyramid {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int j=1;j<i;j++){
                System.out.print(i-j);
            }
            System.out.println();
        }
    }
}
