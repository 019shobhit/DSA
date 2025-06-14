// 1 2 3 4 5 6 7
// 2 3 4 5 6 7 1
// 3 4 5 6 7 1 2
// 4 5 6 7 1 2 3
// 5 6 7 1 2 3 4
// 6 7 1 2 3 4 5
// 7 1 2 3 4 5 6
public class Numerical_Rectangular_pattern {
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            for(int j=1;j<=8-i;j++){
                System.out.print(i+j-1);
            }
            for(int k=1;k<=i-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
